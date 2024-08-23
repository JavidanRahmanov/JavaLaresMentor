package MentorTasks.lesson21.Homework;

import java.util.Scanner;

public class BookStoreApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookStore bookStore = new BookStore();

        while (true) {
            System.out.println("1.Add book\n" +
                    "2.Get list of books\n" +
                    "3.Search for a book\n"+
                    "4.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    System.out.println("Enter title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter author name: ");
                    String author = sc.nextLine();
                    BookCategory category = bookStore.chooseCategory();
                    System.out.println("Enter the price: ");
                    double price = sc.nextDouble();
                    Book newBook = new Book(title, author, category, price);
                    bookStore.addBook(newBook);
                    break;

                case 2:
                    bookStore.listBooks();
                    break;
                case 3:
                   BookCategory bookCategory = bookStore.chooseCategory();
                    bookStore.searchBook(bookCategory);
                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }

        }

    }
}
