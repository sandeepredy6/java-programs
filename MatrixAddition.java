public class MatrixAddition {
    public static void main(String[] args) {
        // Declare and initialize two matrices of the same size
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int rows = matrixA.length;
        int cols = matrixA[0].length;

                int[][] sumMatrix = new int[rows][cols];

       
        if (rows != matrixB.length || cols != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return;
        }

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Print the result matrix
        System.out.println("Result of Matrix Addition:");
        printMatrix(sumMatrix);
    }

    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); 
        }
    }
}
