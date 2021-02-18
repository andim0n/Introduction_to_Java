package m2_algorithmization.pak_4;

// 5. Составить программу, которая в массиве A[N] находит второе по величине число
// (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

import m2_algorithmization.utils.MyUtil;

public class Task_5 {

    public static void main(String[] args) {

        int n = 10;
        int[] a;

        a = MyUtil.setArray(n);
        a = deleteValues(a, a[indexOfMax(a)]);
        System.out.printf("\nThe second max value is %d", a[indexOfMax(a)]);

    }

    static int indexOfMax(int[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[index]) {
                index = i;
            }
        }
        return index;
    }

    static int[] deleteValues(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                a[i] = 0;
            }
        }
        return a;
    }
}
