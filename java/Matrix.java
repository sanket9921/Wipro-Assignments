//Implement a Matrix class that has a constructor which
// initializes the dimensions of a matrix and a method to
// fill the matrix with values.


public class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    public void fillMatrix(int[][] values) {
        if (values.length != rows || values[0].length != cols) {
            System.out.println("Input values array does not match matrix dimensions.");
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = values[i][j];
            }
        }
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage
        int rows = 3;
        int cols = 3;
        Matrix myMatrix = new Matrix(rows, cols);

        int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        myMatrix.fillMatrix(values);
        System.out.println("Matrix:");
        myMatrix.printMatrix();
    }
}
