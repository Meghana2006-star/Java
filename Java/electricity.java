import java.util.Scanner;

class ElectricityBill {
    private String consumerNo;
    private String consumerName;
    private double previousReading;
    private double currentReading;
    private String connectionType;

    public ElectricityBill(String consumerNo, String consumerName, double previousReading, double currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    public double calculateBill() {
        double unitsConsumed = currentReading - previousReading;
        double rate;

        if (connectionType.equalsIgnoreCase("domestic")) {
            rate = 1.5; // Tariff rate for domestic
        } else {
            rate = 2.5; // Tariff rate for commercial
        }

        return unitsConsumed * rate;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Consumer No: ");
        String consumerNo = scanner.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        double previousReading = scanner.nextDouble();

        System.out.print("Enter Current Month Reading: ");
        double currentReading = scanner.nextDouble();

        System.out.print("Enter Connection Type (domestic/commercial): ");
        String connectionType = scanner.next();

        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);
        double billAmount = bill.calculateBill();

        System.out.printf("Total Bill Amount for %s: $%.2f%n", consumerName, billAmount);
    }
}
