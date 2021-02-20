package by.epam.java.module_2.package_1;

/*
 *  9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 *  Если таких чисел несколько, то определить наименьшее из них.
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_9 {

    public static void main(String[] args) {

        int n = 10;
        int[] array = MyUtil.generateArray(n);
        int[] countArray = {1, array[0]};
        int count = 1;

        for (int a : array) {
            for (int b : array) {
                if (a == b) {
                    if (count >= countArray[0]) {
                        countArray[0] = count;
                        countArray[1] = Math.min(a, countArray[1]);
                    }
                    count++;
                }
            }
            count = 1;
        }
        System.out.printf("\nNumber %d (x%d)", countArray[1], countArray[0]);
    }
}
