package MentorTasks.lesson1;

import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {

        Scanner sides = new Scanner(System.in);
        System.out.println("Enter first side of rectangle: ");
        double firstSide = sides.nextDouble();
        System.out.println("Enter second side of rectangle: ");
        double secondSide = sides.nextDouble();

        double perimeter = (firstSide + secondSide)*2;
        System.out.println("Perimeter of rectangle: " +perimeter);

        double area = firstSide * secondSide;
        System.out.println("Area of rectangle: " +area);
        sides.close();
    }
}