package encapsulation;

public class Driver {
    public static void main(String[] args) {
        Book b1 = new Book("Murder on the Orient Express", "Agatha Christie");
        System.out.println(b1.getTitle());
        b1.setTitle("Polar Express");
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        b1.setBorrowed(true);
        if (b1.isBorrowed()) {
            System.out.println("The book you requested is not available.");
        } else {
            System.out.println("It is available.");
        }

    }
}