package MentorTasks.lesson8;

public class Task1 {
    public static void main(String[] args) {
        char[][] matrix = {
                {'A','B','C'},
                {'D','E','F'},
                {'G','H','I'},
        };
        System.out.println("Diagonal character: 1");
        for(int i=0; i<matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        System.out.println("Diagonal character: 2");
        for(int i=0; i<matrix.length; i++) {
            System.out.print(matrix[0+i][matrix.length-1-i] + " ");
        }
        System.out.println();
    }
}
