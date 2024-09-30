import java.util.*;

abstract class Converter {
    abstract void convert();
}

class CurrencyConverter extends Converter {
    void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in Dollars: ");
        double dollars = scanner.nextDouble();
        double inr = dollars * 75; // Example conversion rate
        System.out.println(dollars + " Dollars = " + inr + " INR");
       
        System.out.print("Enter amount in INR: ");
        double inrAmount = scanner.nextDouble();
        double dollarsFromInr = inrAmount / 75;
        System.out.println(inrAmount + " INR = " + dollarsFromInr + " Dollars");
    }
}

class DistanceConverter extends Converter {
    void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();
        double kilometers = meters / 1000;
        System.out.println(meters + " meters = " + kilometers + " kilometers");
       
        System.out.print("Enter distance in kilometers: ");
        double kilometersInput = scanner.nextDouble();
        double metersFromKm = kilometersInput * 1000;
        System.out.println(kilometersInput + " kilometers = " + metersFromKm + " meters");
    }
}

class TimeConverter extends Converter {
    void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in hours: ");
        double hours = scanner.nextDouble();
        double minutes = hours * 60;
        System.out.println(hours + " hours = " + minutes + " minutes");
       
        System.out.print("Enter time in minutes: ");
        double minutesInput = scanner.nextDouble();
        double hoursFromMinutes = minutesInput / 60;
        System.out.println(minutesInput + " minutes = " + hoursFromMinutes + " hours");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter;

        System.out.println("Choose converter:");
        System.out.println("1. Currency");
        System.out.println("2. Distance");
        System.out.println("3. Time");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                converter = new CurrencyConverter();
                break;
            case 2:
                converter = new DistanceConverter();
                break;
            case 3:
                converter = new TimeConverter();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        converter.convert();
    }
}