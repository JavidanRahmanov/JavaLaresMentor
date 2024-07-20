package MentorTasks.lesson1;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner Radius = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = Radius.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle: " + perimeter);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle: " + area);

    }
}
