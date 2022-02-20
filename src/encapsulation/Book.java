package encapsulation;

public class Book {
    // fields (instance variables)
    private String title;
    private String author;
    private boolean isBorrowed;

    // constructors
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // getter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length() > 0 && title.length() <= 30) {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}