package MentorTasks.lesson8;

public class Task3 {
    public static void main(String[] args) {
int[][] matrixa = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
};
int[][] matrixb = {
        {9, 8, 7},
        {6, 5, 4},
        {3, 2, 1},
};
//matrixAddition(matrixa,matrixb);
//matrixMultiplication(matrixa,matrixb);
matrixTranspose(matrixa);
    }

    public static void matrixAddition(int[][] matrix1, int[][] matrix2){
for(int i = 0; i < matrix1.length; i++){
    for(int j = 0; j < matrix1[i].length; j++){
        matrix1[i][j] += matrix2[i][j];
    }
}
        System.out.println("Matrix A +  Matrix B:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = i + 1; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
    public static void matrixTranspose(int[][] matrix){
for(int i = 0; i < matrix.length; i++){
    for(int j = 0; j < matrix[i].length; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
        System.out.println("Transpose of Matrix A:");
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0 ; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
    }
}
