package by.epam.java.module_2.package_3;

import java.util.Arrays;

/*
6. Сортировка Шелла.
Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1.
Если ai <= ai+1, то продвигаются на один элемент вперед.
Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */

public class Task_6 {
    public static void main(String[] args) {

        int[] a = {5, 8, 1, 3, 15, 9, 4, 5, 3, 2, 10, 15};

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int tmp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = tmp;
                if (i == 0)
                    i--;
                else
                    i -= 2;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
