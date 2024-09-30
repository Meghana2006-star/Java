import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        if (isPangram(sentence)) {
            System.out.println(1); // It is a pangram
        } else {
            System.out.println(-1); // It is not a pangram
        }
    }

    private static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26]; // Array to track letters
        int index;

        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Check if character is a letter
                index = ch - 'a'; // Convert letter to index (0-25)
                alphabet[index] = true; // Mark the letter as found
            }
        }

        // Check if all letters are present
        for (boolean present : alphabet) {
            if (!present) return false; // If any letter is missing
        }
        return true; // All letters are present
    }
}
