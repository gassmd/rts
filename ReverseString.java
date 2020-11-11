import java.util.LinkedList;
import java.util.Queue;

public class ReverseString {

    public static void main(String[] args) {
         reverseString(2, "MyString");
     }

        public static String reverseString(int input, String testString){
            String reversedString = "";
            String ans = "";
            int strLength = testString.length();
            Queue<Character> queue = new LinkedList<>();

            for (int i = 1; i <= input; i++) {                                   // iterates through string up to input
                char lastChar = testString.charAt(strLength - i);                 // gets last character, increases with i as string size decreases
                queue.add(lastChar);                                            // adds each last character to queue data structure
                testString = testString.substring(0, testString.length() - 1);    // alters string to remove each last character as it is added to bottom of queue
            }
            for (int j = 0; j < input; j++) {                                    // separate loop to add each character to start of now altered string
                char addChar = queue.remove();                                  // sets new char as char at top of list
                reversedString = addChar + reversedString;                      // creates new "reversed" string by adding each char at top of queue to beginning
                ans = reversedString + testString;                              // adds "reversed" string to remainder of previous string
            }
            System.out.println(ans);
            return ans;
    }
}
