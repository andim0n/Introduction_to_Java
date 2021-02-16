package m2_algorithmization.pak_2;

import m2_algorithmization.utils.MyUtil;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int n = 5;
        int[][] array;
        int[][] result = new int[n][n];
        int firstColumn;
        int secondColumn;

        array = MyUtil.generateMatrix(n, n);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the first column: ");
        firstColumn = scanner.nextInt();
        System.out.print("Enter the number of the second column: ");
        secondColumn = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == firstColumn) {
                    result[i][secondColumn] = array[i][j];
                } else if (j == secondColumn) {
                    result[i][firstColumn] = array[i][j];
                } else {
                    result[i][j] = array[i][j];
                }
            }
        }
        MyUtil.printDoubleArray(result, n, n);

    }
}
