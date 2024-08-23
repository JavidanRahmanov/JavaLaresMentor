package MentorTasks.lesson21.Homework;

public class Book {

private String title;
private String author;
private BookCategory category;
private double price;

    public Book(String title, String author, BookCategory category, double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }
}
