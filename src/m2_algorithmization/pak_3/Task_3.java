package m2_algorithmization.pak_3;

/*
3. Сортировка выбором.
Дана последовательность чисел a1 <= a2 <= ... <= an
Требуется переставить элементы так, чтобы они были расположены по убыванию.
Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
а первый - на место наибольшего.
Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором.
 */

import m2_algorithmization.utils.MyUtil;

public class Task_3 {
    public static void main(String[] args) {

        int n = 10;
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.printf("%d\t", a[i]);
        }

        for (int i = 0; i < a.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    maxIndex = j;
                }
            }
            int tmp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = tmp;
        }


        MyUtil.printArray(a);
    }
}
