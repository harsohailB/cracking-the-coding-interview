package arraystring;

/**
 * Write a method to replace all spaces in a string with '%20'
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
 * <p>
 * EXAMPLE
 * Input:  "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
class _01_03_URLify {
    char[] urlify(char[] chars, int trueLength) {
        for(int i = 0; i < chars.length; i++){
            char character = chars[i];

            if(character == ' '){
                // shift characters to right of space by 2 (to account for two additional chars) 
                // to the right
                for(int j = trueLength - 1; j > i; j--){
                    chars[j + 2] = chars[j];
                }
                trueLength += 2;

                // add URL chars
                chars[i] = '%';
                chars[i + 1] = '2';
                chars[i + 2] = '0';

                // forward index by 2 to skip added chars
                i += 2;
            }
        }

        return chars;
    }
}
