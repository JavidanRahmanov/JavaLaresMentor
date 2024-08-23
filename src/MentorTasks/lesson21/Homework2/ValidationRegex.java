package MentorTasks.lesson21.Homework2;

public class ValidationRegex {

    public static void main(String[] args) {

        String email1 = "example@gmail.com";
        String email2 = "examplemail.ru";

        String phoneNumber1 = "123-456-7890";
        String phoneNumber2 = "+0124643929";

        String password1 = "Cavidan1234@javi!";
        String password2 = "ruhi1234";

        System.out.println(validateEmail(email1));
        System.out.println(validateEmail(email2));

        System.out.println(validatePhoneNumber(phoneNumber1));
        System.out.println(validatePhoneNumber(phoneNumber2));

        System.out.println(validatePassword(password1));
        System.out.println(validatePassword(password2));
    }

    public static boolean validateEmail(String email) {
        String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneRegex = "^(\\+\\d{1,3}[ ]?)?(\\(\\d{3}\\)|\\d{3})[ .-]?\\d{3}[ .-]?\\d{4}$";
        return phoneNumber.matches(phoneRegex);
    }

    public static boolean validatePassword(String password) {
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return password.matches(passwordRegex);
    }

}
