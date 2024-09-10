package MentorTasks.lesson26;

import MentorTasks.lesson21.Homework.Book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("To Kill a Mockingbird", "Harper Lee", 1960),
                new Book("1984", "George Orwell", 1949),
                new Book("Pride and Prejudice", "Jane Austen", 1813),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937)
        );

       books.stream().max(Comparator.comparing(Book::getYear)).
                ifPresentOrElse(
                        book -> System.out.println(book.getTitle()),
                        ()-> System.out.println("No books found!")
                );
    }
}
