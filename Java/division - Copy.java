import java.util.*;
 class IntegerDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number (Num1): ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number (Num2): ");
            int num2 = sc.nextInt();

            // Perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}