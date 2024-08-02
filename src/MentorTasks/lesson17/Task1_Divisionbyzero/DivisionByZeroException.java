package MentorTasks.lesson17.Task1_Divisionbyzero;

public class DivisionByZeroException extends RuntimeException{

    @Override
    public  String getMessage() {
        return super.getMessage();
    }

    public DivisionByZeroException(String message) {
        super(message);
    }
}
