package by.epam.java.module_2.package_1;

/*
 *  3. Дан массив действительных чисел, размерность которого N.
 *  Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_3 {

    public static void main(String[] args) {

        int n = 10;
        double[] array;
        int negative = 0;
        int positive = 0;
        int zero = 0;

        array = MyUtil.generateArrayReal(n);

        for (double a : array) {
            if (a > 0) {
                positive++;
            } else if (a < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.printf("\nPositive: %d\nNegative: %d\nZero: %d", positive, negative, zero);
    }
}
