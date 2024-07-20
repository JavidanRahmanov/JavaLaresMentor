package MentorTasks.lesson10.exercise;

public class LibraryManagementMain {
    public static void main(String[] args) {
        Library library = new Library("Cavidan's Library", "Primorsk 126", 10);
        Book book1 = new Book("978-3-16-148410-0", "Effective Java", "Joshua Bloch", "Addison-Wesley", 2018, 10);
        Book book2 = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", "Prentice Hall", 2008, 15);
        Book book3 = new Book("978-0-262-03384-8", "Introduction to Algorithms", "Thomas H. Cormen", "MIT Press", 2009, 20);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
//        library.getBooks();
        System.out.println(library.findBook("978-0-13-468599-1"));
        library.removeBook("978-3-16-148410-0");
        System.out.println("After removing: ");
        System.out.println(library);
    }
}