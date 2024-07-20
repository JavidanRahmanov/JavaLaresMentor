package MentorTasks.lesson8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[][] matrix = new int[rows][columns];
        int max = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element at position " + "(" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.println("Maximum element of the matrix" + max);
    }
}
