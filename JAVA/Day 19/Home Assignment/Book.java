public class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    Book(Book b) {
        title = b.title;
        author = b.author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");
        Book b2 = new Book(b1);
        b2.display();
    }
}
