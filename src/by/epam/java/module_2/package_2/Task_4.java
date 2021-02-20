package by.epam.java.module_2.package_2;

// 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task_4 {

    public static void main(String[] args) {

        int n = 6;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = n - j;
                }

                System.out.printf("%d\t\t", matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
