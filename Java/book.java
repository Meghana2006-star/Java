class Book {
    // Instance variables
    private String bookName;
    private String isbnNumber;
    private String authorName;
    private String publisher;

    // Constructor to initialize instance variables
    public Book(String bookName, String isbnNumber, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    // Getter and setter for bookName
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // Getter and setter for isbnNumber
    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    // Getter and setter for authorName
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // Getter and setter for publisher
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Method to get book information
    public String getBookInfo() {
        return "Book Name: " + bookName + "\n" +
               "ISBN: " + isbnNumber + "\n" +
               "Author: " + authorName + "\n" +
               "Publisher: " + publisher;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("Effective Java", "978-0134686097", "Joshua Bloch", "Addison-Wesley");

        // Print book information
        System.out.println(book.getBookInfo());
    }
}