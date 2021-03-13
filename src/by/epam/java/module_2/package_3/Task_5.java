package by.epam.java.module_2.package_3;
// TODO Java.util >> Arrays.class >> int binarySearch()
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

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        MyUtil.printArray(a);



    }

    static int[] insert(int[] a, int oldPos, int newPos) {
        int tmp = a[oldPos];
        for (int i = oldPos; i > newPos; i--) {
            a[i] = a[i - 1];
        }
        a[newPos] = tmp;
        return a;
    }

    static void sort(int[] a) {

        int oldPos;
        int newPos;

        while (!isSorted(a)) {
            oldPos = findUnsorted(a);

            for (int i = oldPos; i < a.length; i++) {
                newPos = binarySearch(a, a[i], i - 1) + 1;
                System.out.printf("\n[%d]%d >> [%d]", i, a[i], newPos);
                a = insert(a, i, newPos);
                MyUtil.printArray(a);
            }
        }
    }

    static int findUnsorted(int a[]) {

        int unsortedIndex = -1;

        for (int i = 1; i < a.length; i++) {

            if (a[i] < a[i - 1]) {
                unsortedIndex = i;
                break;
            }
        }
        return unsortedIndex;
    }

    static boolean isSorted(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;

        }
        return true;
    }

    public static int binarySearch(int[] a, int key, int right) {

        int index = 0;
        int left = 0;
//        right--;

        while (left <= right) {

            System.out.printf("\nfrom %d to %d", left, right);

            index = (right + left + 1) / 2;

            if (key == a[index]) {
                System.out.printf("\n%d = [%d]%d", key, index, a[index]);
                break;
            } else if (key < a[index]) {
                System.out.printf("\n%d < [%d]%d", key, index, a[index]);
                index--;
                right = index;
            }

            if (key > a[index]) {
                System.out.printf("\n%d > [%d]%d", key, index, a[index]);
                index++;
                left = index;
            }

        }

        return index;
    }

}
