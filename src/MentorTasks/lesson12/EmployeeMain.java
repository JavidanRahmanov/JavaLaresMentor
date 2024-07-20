package MentorTasks.lesson12;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        String isContinue = " ";
        Scanner sc = new Scanner(System.in);

       while(!isContinue.equals("no")){
           System.out.println("Enter the name of the employee: ");
           String name = sc.nextLine();
           System.out.println("Enter the salary of the employee: ");
           int salary = sc.nextInt();
           System.out.println("Enter the id of the employee: ");
           int id = sc.nextInt();
           Employee emp = new Employee(id, name, salary);
           emp.getTotalSalary();
           emp.getTotalEmployees();
           System.out.println("Do you want to add another employee? (y/n) ");
           sc.nextLine();
           isContinue = sc.nextLine();
       }

    }
}
