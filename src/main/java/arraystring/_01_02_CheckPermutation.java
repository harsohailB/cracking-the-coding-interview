package arraystring;

import java.util.HashMap;
import java.util.Set;

/**
 * Given two strings,write a method to decide if one is a permutation of the other.
 */
class _01_02_CheckPermutation {
    HashMap<Character, Integer> getCharFreqs(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char character = str.charAt(i);
            if(!map.containsKey(character)){
                map.put(character, 0);
            }
            int currCharFreq = map.get(character);
            map.put(character, currCharFreq + 1);
        }

        return map;
    }

    boolean check(String a, String b) {
        HashMap<Character, Integer> aMap = getCharFreqs(a);
        HashMap<Character, Integer> bMap = getCharFreqs(b);

        Set<Character> aKeys = aMap.keySet();
        Set<Character> bKeys = bMap.keySet();

        if(aKeys.size() != bKeys.size()){
            return false;
        }

        for(Character c: aKeys){
            if(aMap.get(c) != bMap.get(c)){
                return false;
            }
        }

        return true;
    }
}
