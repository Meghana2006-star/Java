import java.util.Scanner;

public class StringMerger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();

        System.out.println("Merged String: " + mergeStrings(s1, s2));
    }

    private static String mergeStrings(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            merged.append(s1.charAt(i)).append(s2.charAt(i));
        }
        return merged.append(s1.substring(minLength)).append(s2.substring(minLength)).toString();
    }
}