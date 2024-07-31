class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private Book book;  //Aggregation

    public Library(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void displayBook() {
        System.out.println("Book in library: " + book.getTitle());
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        Library library = new Library(book);

        library.displayBook();

        Library lib1 = new Library(library.getBook());

        lib1.displayBook();
    }
}
