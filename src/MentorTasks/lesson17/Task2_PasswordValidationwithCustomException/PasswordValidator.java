package MentorTasks.lesson17.Task2_PasswordValidationwithCustomException;

public class PasswordValidator {

    public static boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit;
    }

    public static void main(String[] args) {
        String password1 ="Password123";
        String password2 ="pass";
        String password3 ="PASSWORD";
        try{

            if(!validatePassword(password2))
                throw new InvalidPasswordException("Invalid password!");
            System.out.println("Password is valid!");
        }
        catch (InvalidPasswordException e){
            System.out.println("Exception is handled.. " + e);
        }

    }
}
