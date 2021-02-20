package by.epam.java.module_2.package_2;

// 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task_5 {

    public static void main(String[] args) {

        int n = 6;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (j > n - i - 1) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = i + 1;
                }

                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
