package m2_algorithmization.pak_4;

/*
12. Даны натуральные числа К и N.
Написать метод(методы) формирования массива А,
элементами которого являются числа, сумма цифр которых равна К и которые не большее N
 */

import m2_algorithmization.utils.MyUtil;

public class Task_12 {

    public static void main(String[] args) {

        int k = 13;
        int n = 133;

        MyUtil.printArray(generate(k, n));

    }

    static int count(int k, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (sumDigit(i) == k) {
                count++;
            }
        }
        return count;
    }

    static int[] generate(int k, int n) {
        int length = count(k, n);
        int[] a = new int[length];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (sumDigit(i) == k) {
                a[index] = i;
                index++;
            }

        }
        return a;
    }

    static int sumDigit(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
