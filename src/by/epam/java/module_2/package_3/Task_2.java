package by.epam.java.module_2.package_3;

import by.epam.java.module_2.util.MyUtil;

/*
 *  2. Даны две последовательности a1 <= a2 <= an и b1 <= b2 <= bm
 *  Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 *  Примечание. Дополнительный массив не использовать.
 */

public class Task_2 {

    public static void main(String[] args) {

        int n = 10;
        int m = 15;

        int[] a = new int[n + m];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = i * 2;
            System.out.printf("%d\t", a[i]);
        }

        System.out.println();

        for (int i = 0; i < m; i++) {
            b[i] = i * 3;
            System.out.printf("%d\t", b[i]);
        }

        // Сложим два массива в один
        for (int i = n; i < a.length; i++) {
            a[i] = b[i - n];
        }

        // Отсортируем полученный массив методом пузырька
        boolean isSorted = false;
        int temp;

        while (!isSorted) {

            isSorted = true;

            for (int i = 0; i < a.length - 1; i++) {

                if (a[i] > a[i + 1]) {

                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

        MyUtil.printArray(a);

    }
}
