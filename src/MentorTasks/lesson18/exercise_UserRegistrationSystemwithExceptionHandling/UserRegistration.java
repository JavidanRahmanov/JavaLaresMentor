package MentorTasks.lesson18.exercise_UserRegistrationSystemwithExceptionHandling;

public class UserRegistration {

    public static void registerUser(String username , String password) throws UserRegistrationException {
        if(username.length() < 8 || password.length() < 8)
            throw new UserRegistrationException("Password or username is invalid!");
        System.out.println("Correct password and username!");
    }
}
