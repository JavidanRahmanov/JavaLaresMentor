package MentorTasks.lesson17.Task3_LoginSystem;

public class AuthenticateManagement {

    static boolean login(String userName, String password){

         if(userName.equals("Cavidan") && password.equals("cavidan123"))
             return true;
         return false;
     }
}
