package MentorTasks.lesson21.Homework;

public enum BookCategory {

    FICTION("literature in the form of prose that describes imaginary events and people."),
    NON_FICTION("writing or cinema that is about facts and real events"),
    SCIENCE("the subject books or the collection of important study material"),
    HISTORY("a written account of past events, people, and their impacts on society, culture, and the world"),
    FANTASY("the faculty or activity of imagining impossible or improbable things.");

    String description;
    BookCategory(String description) {
        this.description = description;
    }
}
