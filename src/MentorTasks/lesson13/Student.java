package MentorTasks.lesson13;


import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int studentId;
    private String name;
    private int age;
    private int grade;

    public Student(int studentId, String name, int age, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student() {
    }

    public void addStudent(){

        System.out.println("Enter student id: ");
        int studentId = sc.nextInt();
        System.out.println("Enter student name: ");
        sc.nextLine();
        String studentName = sc.nextLine();
        int studentAge = -1;
        while (studentAge < 5 || studentAge > 100) {
            System.out.println("Enter student age (5-100): ");
            studentAge = sc.nextInt();
            if (studentAge < 5 || studentAge > 100) {
                System.out.println("Invalid age. Please enter a value between 5 and 100.");
            }
        }

        int studentGrade = -1;
        while (studentGrade < 1 || studentGrade > 12) {
            System.out.println("Enter student grade (1-12): ");
            studentGrade = sc.nextInt();
            if (studentGrade < 1 || studentGrade > 12) {
                System.out.println("Invalid grade. Please enter a value between 1 and 12.");
            }

            Student student = new Student(studentId, studentName, studentAge, studentGrade);
            students.add(student);
        }
    }

    public void viewStudent(int id) {
        boolean isFound = false;
        for(Student student : students) {
            if(student.getStudentId() == id) {
                System.out.println(student);
                isFound = true;
            }
        }
        if(!isFound) {
            System.out.println("Student is not found!");
        }
    }

    public void updateStudent(int id) {
        boolean isFound = false;
        for(Student student : students) {
            if(student.getStudentId() == id) {
                isFound = true;
                boolean isContinue = true;
                while(isContinue) {
                    System.out.println("1. Add an updated name.\n" +
                            "2. Add an updated age.\n" +
                            "3. Add an updated grade.\n" +
                            "4. Exit to main menu.");
                    System.out.println("What do you want to update?");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch(choice) {
                        case 1:
                            System.out.println("Enter name: ");
                            String newName = sc.nextLine();
                            student.setName(newName);
                            break;
                        case 2:
                            System.out.println("Enter age: ");
                            int newAge = sc.nextInt();
                            student.setAge(newAge);
                            sc.nextLine();
                            break;
                        case 3:
                            System.out.println("Enter grade: ");
                            int newGrade = sc.nextInt();
                            student.setGrade(newGrade);
                            sc.nextLine();
                            break;
                        case 4:
                            isContinue = false;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                }
            }
        }
        if(!isFound) {
            System.out.println("Invalid id!");
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student " +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade;
    }
}
