

public class MatrixClient {
    public static void main(String[] args) {
        Matrix one = new Matrix(2, 2);
        Matrix two = new Matrix(2, 2);

        System.out.println("Columns in matrix one: " + one.getColumns());
        System.out.println();
        System.out.println("Printing matrix two to check printMatrix() method:");
        two.printMatrix();
        System.out.println();
        System.out.println("Making a new matrix by adding the two previous matrices:");
        Matrix three = new Matrix(one.add(two));
        System.out.println("Making a new matrix by multiplying the two first matrices:");
        Matrix four = new Matrix(one.multiply(two));
        System.out.println("Transposing the multiplied matrix:");
        Matrix transposedFour = new Matrix(four.transform());
    }
}
