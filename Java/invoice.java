public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("12345", "Hammer", 5, 12.99);
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}
