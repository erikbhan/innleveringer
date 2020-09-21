import java.util.Scanner;

public class Matrix {
    private final int[][] matrix;

    public Matrix(int[][] contents) {
        this.matrix = new int[contents.length][contents[0].length];
        for (int row = 0; row < contents.length; row++) {
            for (int col = 0; col < contents[0].length; col++) {
                this.matrix[row][col] = contents[row][col];
            }
        }
        System.out.println("This is how the matrix looks:");
        this.printMatrix();
    }

    public Matrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill out the matrix:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(row + ", " + col + ": ");
                this.matrix[row][col] = sc.nextInt();
            }
        }
        System.out.println("This is how the new matrix looks:");
        this.printMatrix();
        System.out.println();
    }

    //TODO: don't need this
    public int getColumns() {
        int columns = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                columns++;
            }
        }
        return columns/2;
    }

    public void printMatrix() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public int[][] add(Matrix matrixToAdd) {
        //check if the inputted matrices can be added; if not, return null
        if (this.matrix.length != matrixToAdd.matrix.length ||
            this.matrix[0].length != matrixToAdd.matrix[0].length) {
            return null;
        }
        int[][] sum = new int[this.matrix.length][this.matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum[row][col] = this.matrix[row][col] + matrixToAdd.matrix[row][col];
            }
        }
        return sum;
    }

    public int[][] multiply(Matrix matrixToMultiply) {
        //check if the inputted matrices can be multiplied; if not, return null
        if (this.matrix.length != matrixToMultiply.matrix[0].length ||
            this.matrix[0].length != matrixToMultiply.matrix.length) {
            return null;
        }
        int[][] product = new int[this.matrix.length][matrixToMultiply.getColumns()];

        //Loop through the new matrix's grid
        for (int row = 0; row < this.matrix.length; row++) {
            for (int col = 0; col < matrixToMultiply.matrix[0].length; col++) {

                //Every spot in the new matrix's grid is calculated by looping through all the numbers in matrix 1's
                //column, and multiplying them with the second matrix's corresponding number
                for (int col2 = 0; col2 < this.matrix[0].length; col2++) {
                    product[row][col] += this.matrix[row][col2] * matrixToMultiply.matrix[col2][col];
                }

            }
        }
        return product;
    }

    public int[][] transform() {
        //new matrix with inverted dimensions
        int[][] transformedMatrix = new int[this.matrix[0].length][this.matrix.length];

        //loop through the original matrix again
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                transformedMatrix[col][row] = this.matrix[row][col];
            }
        }
        return transformedMatrix;
    }
}
