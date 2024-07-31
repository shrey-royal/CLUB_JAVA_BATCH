class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    // Create/Read/Update/Delete

    // Create / Insert / Add
    public boolean addBook(Book book) {
        if(count >= books.length) {
            System.out.println("Can't add "+book.getTitle()+" as library is currently full! \n");
            return false;
        }
        books[count++] = book;
        // System.out.println(book.getTitle() + " added in the library.");
        return true;
    }

    // Read / Show
    public void listAllBooks() {
        if(count == 0) {
            System.out.println("There are currently 0 books in the library \n");
            return;
        }
        System.out.println("Books in the library: ");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].getTitle());
        }
        System.out.println();
    }

    // Update / Modify / Edit
    public boolean updateBook(String oldTitle, String newTitle) {
        for (int i = 0; i < count; i++) {
            if(books[i].getTitle().toLowerCase().equals(oldTitle.toLowerCase())) {
                books[i].setTitle(newTitle);
                return true;
            }
        }
        System.out.println("Failed to Update Book-: "+ oldTitle);
        return false;
    }

    public boolean removeBook(String title) {
        for (int i = 0; i < count; i++) {
            if(books[i].getTitle().toLowerCase().equals(title.toLowerCase())) {
                //shift books
                    for (int j = i; j < count-1; j++) {
                        books[j] = books[j+1];
                    }
                    books[count--] = null;  //clear the last reference
                    System.out.println(title + " removed from the library! \n");
                    return true;
            }
        }
        System.out.println("Failed to remove book-: "+ title + "\n");
        return false;
    }
}

public class Agg_1 {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addBook(new Book("C Programming"));
        library.addBook(new Book("C++ Programming"));
        library.addBook(new Book("Java Programming"));
        library.addBook(new Book("Python Programming"));

        library.listAllBooks();

        // library.updateBook("Python Prog.", "Python with DS & AI");
        library.removeBook("C  Programming");

        library.listAllBooks();
    
    }
}
