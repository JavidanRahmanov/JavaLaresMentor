package MentorTasks.lesson13;



import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        String isContinue = "yes";
        while(isContinue.equalsIgnoreCase("yes")) {
            System.out.println("1. Add a new student.\n" +
                    "2. View student details by ID.\n" +
                    "3. Update student details by ID.\n" +
                    "4. Exit the application.");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    student.addStudent();
                    break;
                case 2:
                    System.out.println("Enter student ID: ");
                    int id = sc.nextInt();
                    student.viewStudent(id);
                    break;
                case 3:
                    System.out.println("Enter student ID: ");
                    int id1 = sc.nextInt();
                    student.updateStudent(id1);
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Do you want to continue? (yes/no)");
            isContinue = sc.next();
        }
        sc.close();
    }
}
