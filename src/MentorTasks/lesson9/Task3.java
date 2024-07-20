package MentorTasks.lesson9;


import java.util.Scanner;

public class Task3 {

    private String name;
    private int age;
    private int grade;


    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    public int getGrade() {
        return grade;
    }

void Scanner(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter student's name: ");
     this.name = sc.nextLine();
    System.out.println("Please enter student's age: ");
     this.age = sc.nextInt();
    System.out.println("Please enter student's grade: ");
     this.grade = sc.nextInt();
}

    void display() {
        System.out.println("Student name: " + getName());
        System.out.println("Student age: " + getAge());
        System.out.println("Student grade: " + getGrade());
        System.out.println(GradeLetter());
    }
    public char GradeLetter() {
        char gradeLetter;
        if (grade >= 90) {
            gradeLetter = 'A';
        } else if (grade >= 80) {
            gradeLetter = 'B';
        } else if (grade >= 70) {
            gradeLetter = 'C';
        } else if (grade >= 60) {
            gradeLetter = 'D';
        } else {
            gradeLetter = 'F';
        }
        return gradeLetter;
    }
}

