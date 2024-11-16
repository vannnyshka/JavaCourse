package lesson6.linkTasks.t3_matrix;

public class Main {

    public static void main(String[] args) {


        Matrix matrix = new Matrix(4, 4);
        matrix.printMatrix();
        System.out.println();

        Matrix matrixTwo = new Matrix(3, 3);
        Matrix.sumMatrix(matrix.getMatrix(), matrixTwo.getMatrix());
        System.out.println();

        Matrix matrixTree = new Matrix(4, 4);
        matrixTree.printMatrix();
        System.out.println("\nСумма первой и третьей матрицы:");
        Matrix.sumMatrix(matrix.getMatrix(), matrixTree.getMatrix());


        System.out.println("\nПроизведение первой и третьей матрицы:");
        Matrix.multMatrix(matrix.getMatrix(), matrixTree.getMatrix());

        System.out.println("\nПроизведение первой матрицы на число 4.0:");
        Matrix.multMatrixToNum(matrix.getMatrix(), 4);

        System.out.printf("%10s%n", "1000");
    }
}
