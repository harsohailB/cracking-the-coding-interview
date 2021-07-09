package arraystring;

/**
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * <p>
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
class _01_05_OneAway {
    boolean isOneAway(String a, String b) {
        int charDiff = b.length() - a.length();
        if(charDiff > 1){
            return false;
        }

        if(charDiff == 1){ // add (maybe an edit)
            for(int i = 0; i < b.length(); i++){
                String bRemoved = b.substring(0, i) + b.substring(i + 1);
                if(bRemoved.equals(a)){
                    return true;
                }
            }
        }else if(charDiff == -1){ // delete (maybe an edit)
            for(int i = 0; i < a.length(); i++){
                String aRemoved = a.substring(0, i) + a.substring(i + 1);
                if(aRemoved.equals(b)){
                    return true;
                }
            }
        }else{ // edit (potentially more than 1)
            int editCount = 0;
            
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) != b.charAt(i)){
                    editCount++;
                    if(editCount > 1){
                        return false;
                    }
                }
            }

            return true;
        }

        return false;
    }
}