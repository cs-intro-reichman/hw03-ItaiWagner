/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        int sLength = s.length();
        String outStr = "";
        for (int i = 0; i < sLength; i++) {
            char letter = s.charAt(i);
            // using the ASCII codes to convert the letters
            if ((letter >= 65) && (letter <= 90)) {
                int decimalCode = (int) letter + 32;
                letter = (char) decimalCode;
            }
            outStr = outStr + letter;
        }
        return outStr;
    }
}
