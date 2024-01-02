/** String processing exercise 2. */
public class uniquechars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
        System.out.println();
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        int sLength = s.length();
        String outStr = "";
        for (int i = 0; i < sLength; i++) {
            char newLetter = s.charAt(i);
            boolean doNotPrint = false;
            for (int n = 0; n < outStr.length(); n++) {
                char existingLetter = outStr.charAt(n);
                if ((existingLetter == newLetter) && (newLetter != ' ')) {
                    doNotPrint = true;
                }
            }
            if (!doNotPrint) {
            outStr = outStr + newLetter;
            }
        }
        return outStr;
    }
}
