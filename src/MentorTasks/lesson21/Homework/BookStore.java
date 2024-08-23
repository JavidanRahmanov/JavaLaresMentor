package MentorTasks.lesson21.Homework;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {
    Scanner sc = new Scanner(System.in);
    List<Book> books = new ArrayList<>();

    Book book1 = new Book("The Great Adventure", "John Smith", BookCategory.FICTION, 19.99);
    Book book2 = new Book("The Science of Everything", "Jane Doe", BookCategory.SCIENCE, 25.50);
    Book book3 = new Book("World History 101", "Emily Johnson", BookCategory.HISTORY, 30.00);
    Book book4 = new Book("Fantasy Land", "Michael Brown", BookCategory.FANTASY, 15.75);
    Book book5 = new Book("The Art of Thinking Clearly", "Rolf Dobelli", BookCategory.NON_FICTION, 18.25);

    public BookStore() {
        addBook(book1);
        addBook(book2);
        addBook(book3);
        addBook(book4);
        addBook(book5);
    }

    void addBook(Book book) {

        books.add(book);
    }

    void listBooks() {

        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }

    }

    BookCategory chooseCategory() {
        System.out.println("Choose one of the category:\n" +
                "1.Fiction\n" +
                "2.History\n" +
                "3.Fantasy\n" +
                "4.Non-fiction\n");

        int choice2 = sc.nextInt();
        switch (choice2) {

            case 1:
                return BookCategory.FICTION;
            case 2:
                return BookCategory.SCIENCE;
            case 3:
                return BookCategory.HISTORY;
            case 4:
                return BookCategory.FANTASY;
            case 5:
                return BookCategory.NON_FICTION;
            default:
                System.out.println("Invalid choice!");
                return null;
        }
    }

    void searchBook(BookCategory category) {
        boolean isFound = false;
        for (Book book : books) {
            if (book.getCategory() == category) {
                System.out.println(book);
                isFound = true;
            }
        }
        if (!isFound)
            System.out.println("Book is not found.");
    }


}
