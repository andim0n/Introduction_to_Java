package by.epam.java.module_2.package_3;
// TODO binary search
/*
 *  5. Сортировка вставками.
 *  Дана последовательность чисел a1,a2,...,an.
 *  Требуется переставить числа в порядке возрастания.
 *  Делается это следующим образом. Пусть a1,a2,...,ai - упорядоченная последовательность, т. е. a1 <= a2 <= ... <= an.
 *  Берется следующее число a[i+1] a и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей.
 *  Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
 *  Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
 *  Двоичный поиск оформить в виде отдельной функции.
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_5 {

    public static void main(String[] args) {

        int n = 0;
        int[] a = {0, 1, 2, 3, 12, 13, 14, 15, 16, 17, 18, 19, 4, 5, 6, 7, 8, 9, 11};
//        int[] b = new int[a.length];

        // Найдем первый неупорядоченный элемент
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] < a[i]) {
                n = i + 1;
                break;
            }
        }
        System.out.println(n);

//        System.out.println(binarySearch(a, 10, 0, a.length - 1));

        int pos;
        int tmp;

        for (int i = n; i < a.length; i++) {

            pos = binarySearch(a, a[i], 0, i - 1);
            tmp = a[i];

            for (int j = i; j > pos; j--) {

                a[j] = a[j - 1];
            }
            a[i] = tmp;
        }

        MyUtil.printArray(a);

    }

    public static int binarySearch(int[] a, int key, int left, int right) {

        int index = -1;

        while (left <= right) {

            index = (right + left) / 2;

            if (key > a[index])
                left = index + 1;

            if (key < a[index])
                right = index - 1;

            if (key == a[index])
                break;
        }

        return index;
    }

}
