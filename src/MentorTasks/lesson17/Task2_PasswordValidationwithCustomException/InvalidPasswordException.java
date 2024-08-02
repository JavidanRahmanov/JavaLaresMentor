package MentorTasks.lesson17.Task2_PasswordValidationwithCustomException;

public class InvalidPasswordException extends Exception{

    public InvalidPasswordException(String message) {
        super(message);
    }
}
