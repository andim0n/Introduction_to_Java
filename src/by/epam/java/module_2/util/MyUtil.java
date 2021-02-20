package by.epam.java.module_2.util;

public class MyUtil {

    public static int[] generateArray(int n) {

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
            System.out.printf("%d\t", array[i]);
        }
        return array;
    }

    public static double[] generateArrayReal(int n) {

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 10) - 5;
            System.out.printf("%.1f\t\t", array[i]);
        }
        return array;
    }

    public static void printArray(int[] array) {

        System.out.printf("\n");

        for (int a : array) {
            System.out.printf("%d\t", a);
        }
    }

    public static void printArray(double[] array) {

        System.out.printf("\n");

        for (double a : array) {
            System.out.printf("%.1f\t", a);
        }
    }

    public static int[][] generateMatrix(int m, int n) {

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100) + 1;
                System.out.printf("%d\t\t", matrix[i][j]);
            }
            System.out.printf("\n");
        }
        return matrix;
    }

    public static void printMatrix(int[][] array, int m, int n) {

        System.out.printf("\n\n");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.printf("%d\t\t", array[i][j]);

            }
            System.out.printf("\n");
        }
    }

    public static void printMatrix(int[][] matrix) {

        System.out.printf("\n\n");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.printf("%d\t\t", matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }

}
