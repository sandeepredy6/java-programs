public class MatrixMultiplication {

    public static void main(String[] args) {
        // First matrix: 2 rows and 3 columns
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Second matrix: 3 rows and 2 columns
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Get dimensions
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied. Columns of the first matrix must equal rows of the second.");
            return;
        }

        // Resultant matrix will have dimensions rowsA x colsB
        int[][] productMatrix = new int[rowsA][colsB];

        // Perform matrix multiplication using three nested loops
        for (int i = 0; i < rowsA; i++) { // For rows of matrixA
            for (int j = 0; j < colsB; j++) { // For columns of matrixB
                for (int k = 0; k < colsA; k++) { // For columns of matrixA and rows of matrixB
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Result of Matrix Multiplication:");
        printMatrix(productMatrix);
    }

    /**
     * Helper method to print a 2D array (matrix).
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}