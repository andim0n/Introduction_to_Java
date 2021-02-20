package by.epam.java.module_2.package_2;

/*
 *  8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 *  на соответствующие им позиции другого, а его элементы второго переместить в первый.
 *  Номера столбцов вводит пользователь с клавиатуры.
 */

import by.epam.java.module_2.util.MyUtil;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        int n = 5;
        int[][] matrix;
        int[][] newMatrix = new int[n][n];
        int firstColumn;
        int secondColumn;

        matrix = MyUtil.generateMatrix(n, n);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the first column: ");
        firstColumn = scanner.nextInt();

        System.out.print("Enter the number of the second column: ");
        secondColumn = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (j == firstColumn)
                    newMatrix[i][secondColumn] = matrix[i][j];

                else if (j == secondColumn)
                    newMatrix[i][firstColumn] = matrix[i][j];

                else
                    newMatrix[i][j] = matrix[i][j];

            }
        }
        MyUtil.printMatrix(newMatrix, n, n);

    }
}
