class SavingsAccount {
    private static double annualInterestRate; // Static variable for interest rate
    private double savingsBalance; // Instance variable for savings balance

    // Constructor to initialize savings balance
    public SavingsAccount(double initialBalance) {
        savingsBalance = initialBalance;
    }

    // Method to calculate and add monthly interest to savings balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Method to get the current savings balance (for display purposes)
    public double getSavingsBalance() {
        return savingsBalance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Set the annual interest rate
        SavingsAccount.modifyInterestRate(0.04); // 4%

        // Create a savings account with an initial balance
        SavingsAccount account1 = new SavingsAccount(1000.0);
        account1.calculateMonthlyInterest(); // Calculate interest for the first month

        System.out.printf("Savings Balance after one month: $%.2f%n", account1.getSavingsBalance());
       
        // Modify interest rate
        SavingsAccount.modifyInterestRate(0.05); // Change to 5%

        // Create another savings account
        SavingsAccount account2 = new SavingsAccount(2000.0);
        account2.calculateMonthlyInterest(); // Calculate interest for the first month

        System.out.printf("Savings Balance after one month: $%.2f%n", account2.getSavingsBalance());
    }
}