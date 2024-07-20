package MentorTasks.lesson4;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your temperature unit(Celsius or Fahrenheit): ");
        char tempUnit = sc.next().charAt(0);
        System.out.println("Enter temperature value: ");
        int temp = sc.nextInt();
        int convertedTemp = 0;
        boolean celsius = false;
        if (tempUnit == 'C')
            convertedTemp = temp * 9 / 5 + 32;

        else if (tempUnit == 'F') {
            convertedTemp = (temp - 32) * 5 / 9;
            celsius = true;
        } else
            System.out.println("Invalid temperature unit");
        System.out.println("Original temperature value: " + temp);
        if(celsius) {
            System.out.println("Converted temperature: " + convertedTemp + " C");
        } else
            System.out.println("Converted temperature: " + convertedTemp + " F");
    }
}
