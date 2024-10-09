/* 
Ask the user to enter two words -
Tell the user which word is longer -
Show each word split into halves; odd length words should have the extra letter in the second half - 
Inform the user at what index the second word is found in the first word (or not found). -
Use length method at least once -
Use indexOf method at least once -
Use substring (one-parameter version) at least once -
Use substring (two-parameter version) at least once - 
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your first word: ");
        String word1 = scan.nextLine(); // user inputting first word

        System.out.print("Please enter your second word: ");
        String word2 = scan.nextLine(); // user inputting second word

        // comparing the lengths
        int lengthWord1 = word1.length();
        int lengthWord2 = word2.length();

        if (lengthWord1 > lengthWord2) {
            System.out.println(word1 + " is longer!");
        } if (lengthWord1 < lengthWord2) {
            System.out.println(word2 + " is longer!");
        } if (lengthWord1 == lengthWord2) {
            System.out.println("Both strings have the same length!");
        }

        //splitting the words in half
        String firstHalfWord1 = word1.substring(0,(lengthWord1/2));
        String secondHalfWord1 = word1.substring((lengthWord1/2));
        String firstHalfWord2 = word2.substring(0,(lengthWord2/2));
        String secondHalfWord2 = word2.substring((lengthWord2/2));
        System.out.println("First Half: " + firstHalfWord1);
        System.out.println("Second Half: " + secondHalfWord1);
        System.out.println("First Half: " + firstHalfWord2);
        System.out.println("Second Half: " + secondHalfWord2);

        // finding if word2 is in word1
        int index = word1.indexOf(word2);
        if (index == -1) {
            System.out.println(word2 + " is NOT found in " + word1);
        } else {
            System.out.println(word2 + " is found in " + word1 + " at index " + index);
        }
        scan.close();
    }
}
