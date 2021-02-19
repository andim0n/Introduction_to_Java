package m2_algorithmization.pak_4;

/*
10. Дано натуральное число N.
Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */

import m2_algorithmization.utils.MyUtil;

public class Task_10 {

    public static void main(String[] args) {

        int n = 12345;

        MyUtil.printArray(numParse(n));

    }

    static int[] numParse(int n) {

        int length = findLength(n);
        int[] digits = new int[length];

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        return digits;

    }

    static int findLength(int n) {

        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }

}
