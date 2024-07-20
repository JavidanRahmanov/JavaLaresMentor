package MentorTasks.lesson10.exercise;

import java.util.Arrays;

public class Library {
   private  String libraryName;
    String address;
    Book[] books ;
    int size;

    public Library(String libraryName, String address, int capacity) {
        this.libraryName = libraryName;
        this.address = address;
        this.books = new Book[capacity];
        this.size = 0;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addBook(Book book) {
        if (size == books.length) {
            Book[] newBooks = new Book[size * 2];
            for (int i = 0; i < size; i++) {
                newBooks[i] = books[i];
            }
            books = newBooks;
        }
        books[size++] = book;
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                break;
            }
        }
    }

    public Book findBook(String isbn){
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn().equals(isbn))
                return books[i];
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", address='" + address + '\'' +
                ", books=" + Arrays.toString(books) +
                ", size=" + size +
                '}';
    }
}
