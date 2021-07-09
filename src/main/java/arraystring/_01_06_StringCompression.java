package arraystring;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3.
 * If the "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
class _01_06_StringCompression {
    String compress(String s) {
        if(s.length() == 1){
            return s.charAt(0) + "1";
        }

        StringBuilder stringBuilder = new StringBuilder();

        int currCount = 0;
        char currChar = 'a', lastChar = 'a';
        for(int i = 0; i < s.length(); i++){
            if(i > 0){
                currChar = s.charAt(i);
                lastChar = s.charAt(i - 1);
                if(currChar != lastChar){
                    stringBuilder.append(lastChar);
                    stringBuilder.append(currCount);
                    currCount = 1;
                    continue;
                }
            }

            currCount += 1;
        }

        stringBuilder.append(currChar);
        stringBuilder.append(currCount);
        return stringBuilder.toString();
    }
}
