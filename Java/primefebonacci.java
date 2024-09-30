public class PrimeFibonacci {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to generate Fibonacci numbers and check if they are prime
    public static void printPrimeFibonacciNumbers(int limit) {
        int a = 0, b = 1;
        while (a < limit) {
            if (isPrime(a)) {
                System.out.println(a);
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Prime Fibonacci numbers below 100,000:");
        printPrimeFibonacciNumbers(100000);
    }
}