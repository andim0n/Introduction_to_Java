package by.epam.java.module_2.package_2;

/*
 *  11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
 *  Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */

public class Task_11 {

    public static void main(String[] args) {

        int m = 10;
        int n = 20;
        int[][] array = new int[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                array[i][j] = (int) (Math.random() * 16);


                if (array[i][j] == 5) {
                    count++;
                    System.out.printf("[%d]\t", array[i][j]);
                } else
                    System.out.printf("%d\t", array[i][j]);
            }
            System.out.printf("\n");

            if (count >= 3) {

                System.out.printf("This %d line contains five %d times\n", i, count);
            }
            count = 0;
        }

    }

}
