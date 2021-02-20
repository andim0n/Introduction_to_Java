package by.epam.java.module_2.package_1;

/*
 *  2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 *  Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_2 {

    public static void main(String[] args) {

        double z = 60;
        int count = 0;
        int n = 10;
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.printf("%.1f\t", array[i]);
            if (array[i] > z) {
                array[i] = z;
                ++count;
            }
        }

        MyUtil.printArray(array);
        System.out.printf("\nNum of changes: %d", count);

    }
}
