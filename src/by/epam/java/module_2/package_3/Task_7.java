package by.epam.java.module_2.package_3;

import java.util.Arrays;

/*
7. Пусть даны две неубывающие последовательности действительных чисел
a1 <= a2 <= ... an и b1 <= b2 <= ... <= bm
Требуется указать те места, на которые нужно вставлять элементы последовательности
b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Task_7 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {0, 2, 4, 6, 8};
        int[] c = new int[a.length + b.length];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // Объединение двух массивов в один
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = a.length; i < a.length + b.length; i++) {
            c[i] = b[i - b.length];
        }

        // Сортировка полученного массива методом Шеллера
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] > c[i + 1]) {
                int tmp = c[i];
                c[i] = c[i + 1];
                c[i + 1] = tmp;
                if (i == 0)
                    i--;
                else
                    i -= 2;
            }
        }
        System.out.println(Arrays.toString(c));

        // Поиск индексов вхождений элементов массива b
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[j] == b[i]) {
                    System.out.printf("\nElement %d, position %d", b[i], j);
                }
            }
        }
    }

}
