package java_assignment_3;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the library: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library");
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

public class LibraryTester {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("Wings of Fire", "APJ Abdul Kalam");

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.removeBook(book1);

        library.displayBooks();
    }
}


