abstract class Bank {
    // Abstract method to be implemented by subclasses
    abstract double getBalance();
}

class BankA extends Bank {
     double balance = 100.0; // Balance for Bank A
    double getBalance() {
        return balance;
    }
}

class BankB extends Bank {
     double balance = 150.0; // Balance for Bank B
    double getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    double balance = 200.0; // Balance for Bank C

    double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}