package by.epam.java.module_2.package_1;

/*
 *  10. Дан целочисленный массив с количеством элементов п.
 *  Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 *  Примечание. Дополнительный массив не использовать.
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_10 {

    public static void main(String[] args) {

        int n = 10;
        int[] array = MyUtil.generateArray(n);

        System.out.printf("\nResult:\n");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
                continue;
            }
            System.out.printf("%d\t", array[i]);
        }

    }
}
