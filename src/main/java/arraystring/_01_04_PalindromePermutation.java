package arraystring;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 */
/**
 * DID NOT GET (TO UNDERSTAND)
 */
class _01_04_PalindromePermutation {
    boolean check(String s) {
        if(s.length() < 2){
            return true;
        }

        return permutation("", s);
    }

    boolean permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0){
            return isPalindrome(prefix);
        }
        else {
            for (int i = 0; i < n; i++){
                boolean ans =  permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
                if(ans){
                    return true;
                }
            }
        }

        return false;
    }

    boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
}
