package by.epam.java.module_3.package_2;

// 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task_1 {

    public static void main(String[] args) {

        String str = "  2   3    4   ";

        char[] array = str.toCharArray();
        int count = 0;
        int max = 0;

        for (int i = 0; i < array.length - 1; i++) {

            while (array[i] == ' ' && i < array.length - 1) {
                count++;
                i++;
            }

            if (count > max) {
                max = count;
            }
            count = 0;
        }

        System.out.println(max);

    }
}
