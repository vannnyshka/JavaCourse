package lesson6.linkTasks.t3_matrix;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Matrix {

    private int rows;
    private int cols;
    private double[][] matrix = new double[rows][cols];

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = generateMatrix(rows, cols);
    }

    public double[][] getMatrix() {
        return matrix;
    }

    private static double getScaleDouble(double num) {
        BigDecimal bd = BigDecimal.valueOf(num);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    private double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                matrix[i][j] = Matrix.getScaleDouble(Math.random() * 10);

            }
        }

        return matrix;
    }

    public void printMatrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sumMatrix(double[][] matrixA, double[][] matrixB) {

        int rowsA = matrixA.length;
        int rowsB = matrixB.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;


        if ((rowsA != rowsB) || (colsA != colsB)) {
            System.out.println("Матрицы должны быть одинаковыми.");
        } else {

            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    System.out.print((Matrix.getScaleDouble(matrixA[i][j] + matrixB[i][j])) + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void multMatrixToNum(double[][] matrix, double num) {
        int cols = matrix[0].length;

        for (double[] doubles : matrix) {
            for (int j = 0; j < cols; j++) {
                System.out.print((Matrix.getScaleDouble(doubles[j] * num)) + "\t");
            }
            System.out.println();
        }

    }


    public static void multMatrix(double[][] matrixA, double[][] matrixB) {

        int rowsA = matrixA.length;
        int rowsB = matrixB.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        double numb = 0;

        if ((rowsA != rowsB) || (colsA != colsB)) {
            System.out.println("Матрицы должны быть одинаковыми.");
        } else {
            for (double[] doubles : matrixA) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        numb += doubles[k] * matrixB[k][j];
                    }
                    System.out.print(Matrix.getScaleDouble(numb) + "\t");
                    numb = 0;
                }
                System.out.println();
            }
        }
    }


}
