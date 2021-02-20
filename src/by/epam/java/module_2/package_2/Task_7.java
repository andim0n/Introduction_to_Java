package by.epam.java.module_2.package_2;

/*
 *  7. Сформировать квадратную матрицу порядка N по правилу:
 *  и подсчитать количество положительных элементов в ней.
 */

public class Task_7 {

    public static void main(String[] args) {

        int n = 5;
        double[][] matrix = new double[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matrix[i][j] = (Math.sin(Math.pow(i, 2) - Math.pow(j, 2))) / n;
                System.out.printf("%.3f\t\t", matrix[i][j]);

                if (matrix[i][j] > 0) {
                    count++;
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("There are %d positive numbers in the matrix", count);
    }
}
