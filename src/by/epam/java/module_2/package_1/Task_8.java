package by.epam.java.module_2.package_1;

/*
 *  8. Дана последовательность целых чисел. Образовать новую последовательность,
 *  выбросив из исходной те члены, которые равны min(a1,a2,...,an).
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_8 {

    public static void main(String[] args) {

        int n = 10;
        int[] array = MyUtil.generateArray(n);
        int min = array[0];
        int count = 0;

        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        System.out.printf("\nMin: %d", min);

        for (int a : array) {
            if (a == min) {
                count++;
            }
        }
        System.out.printf("\nCount: %d", count);

        int[] newArray = new int[n - count];
        int i = 0;

        for (int a : array) {
            if (!(a == min)) {
                newArray[i] = a;
                i++;
            }
        }

        MyUtil.printArray(newArray);
    }
}

