package by.epam.java.module_2.package_3;

/*
 *  1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 *  Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
 *  при этом не используя дополнительный массив
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_1 {

    public static void main(String[] args) {

        int n = 3;
        int m = 10;
        int k = 1;

        int[] array1 = new int[n + m];
        int[] array2 = new int[m];

        for (int i = 0; i < n; i++) {
            array1[i] = i;
        }
        for (int i = 0; i < m; i++) {
            array2[i] = i + 100;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", array1[i]);
        }

        MyUtil.printArray(array2);

        for (int i = n + m - 1; i >= k + 1 + m; i--) {
            array1[i] = array1[i - m];
        }

        for (int i = k + 1; i < k + 1 + m; i++) {
            array1[i] = array2[i - k - 1];
        }

        MyUtil.printArray(array1);
    }
}
