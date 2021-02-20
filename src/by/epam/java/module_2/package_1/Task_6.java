package by.epam.java.module_2.package_1;

/*
 *  6. Задана последовательность N вещественных чисел.
 *  Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_6 {

    public static void main(String[] main) {

        int n = 30;
        int sum = 0;

        int[] array = MyUtil.generateArray(n);

        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    sum += array[i];
                }
            }
        }
        System.out.printf("\n Sum = %d", sum);
    }
}
