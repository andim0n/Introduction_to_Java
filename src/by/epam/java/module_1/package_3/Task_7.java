package by.epam.java.module_1.package_3;

/*
7. Для каждого натурального числа в промежутке от m до n вывести все делители,
кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m, n;

        System.out.print("m = ");
        m = scanner.nextInt();

        System.out.print("n = ");
        n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            if (i > 0) {
                for (int j = 2; j <= i; j++) {
                    if ((0 == (i % j)) && !(j == i)) {
                        System.out.printf("%d / %d = %d\n", i, j, i / j);
                    }
                }
            }
        }
    }
}
