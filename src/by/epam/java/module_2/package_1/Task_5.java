package by.epam.java.module_2.package_1;

// 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

import by.epam.java.module_2.util.MyUtil;

public class Task_5 {

    public static void main(String[] args) {

        int n = 10;
        int[] array = MyUtil.generateArray(n);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.printf("\n%d > %d ", array[i], i);
            }
        }
    }
}
