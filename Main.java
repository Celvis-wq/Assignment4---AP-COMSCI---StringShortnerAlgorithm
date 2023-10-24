// AP COMSCI - StringShortnerAlgoritm : Main.java
// By: Celvis - Contact Discord @Celvis for any issues
// Version: 0.0.1

/*
 * This is the 4th assignment for ProjectStem - 10/23/2023
 * Written By: Celvis
 * Please note: If you are taking this for your usage and the grading doesn't appear right, try removing "import java.io.IOException" and removing "throws IOException"
 */

// Import
import java.io.IOException;
import java.util.*;

// Main Class
public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Store/Input
        System.out.println("Type the message to be shortened");
        String message = scan.nextLine().toLowerCase();

        // Algorithm 1
        int vowelCount = 0; // vowelCount variable
        String shortenedMessage1 = ""; // shortened message
        char prevChar = ' '; // previous character
        boolean isWordStart = true; // isWordStart variable

        // remove characters
        for (char c : message.toCharArray()) {
            if ("aeiou".contains(String.valueOf(c))) {
                if (isWordStart) {
                    shortenedMessage1 += c;
                    isWordStart = false;
                } else {
                    vowelCount++;
                }
            } else {
                if (c == ' ' || c != prevChar) {
                    shortenedMessage1 += c;
                }
            }
            if (c == ' ') {
                isWordStart = true;
            }
            prevChar = c;
        }

        // Algorithm 1 output
        System.out.println("\nAlgorithm 1");
        System.out.println("Vowels removed: " + vowelCount);
        System.out.println("Repeats removed: " + (message.length() - shortenedMessage1.length()));
        System.out.println("Algorithm 1 message: " + shortenedMessage1);
        System.out.println("Algorithm 1 characters saved: " + (message.length() - shortenedMessage1.length()) + "\n");

        // Algorithm 2
        int uniqueCharCount = 0; // uniqueCharCount variable
        String shortenedMessage2 = ""; // shortenedMessage2 variable

        // count the number of unique characters
        for (char c : message.toCharArray()) {
            if (c != ' ' && shortenedMessage2.indexOf(c) == -1) {
                uniqueCharCount++;
                int charCount = 0;
                for (char d : message.toCharArray()) {
                    if (c == d) {
                        charCount++;
                    }
                }
                shortenedMessage2 += charCount + String.valueOf(c);
            }
        }

        // Algorithm 2 output
        System.out.println("Algorithm 2");
        System.out.println("Unique characters found: " + uniqueCharCount);
        System.out.println("Algorithm 2 message: " + shortenedMessage2);
        System.out.println("Algorithm 2 characters saved: " + (message.length() - shortenedMessage2.length()));

        // close scanner and exit program
        scan.close();
        System.exit(0);
    }
}