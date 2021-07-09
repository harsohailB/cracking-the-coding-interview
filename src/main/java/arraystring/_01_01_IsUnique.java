package arraystring;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */

class _01_01_IsUnique {

    boolean isUnique(String str) {
        boolean[] seen = new boolean[256];

        for(int i = 0; i < str.length(); i++){
            char character = str.charAt(i);
            if(seen[character]){
                return false;
            }else{
                seen[character] = true;
            }
        }
        
        return true;
    }

}
