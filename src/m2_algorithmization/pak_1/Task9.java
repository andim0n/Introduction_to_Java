package m2_algorithmization.pak_1;

import m2_algorithmization.utils.MyUtil;

public class Task9 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = MyUtil.setArray(n);
        int[] countArray = {1, array[0]};
        int count = 1;

        for (int a : array) {
            for (int b : array) {
                if (a == b) {
                    if (count >= countArray[0]) {
                        countArray[0] = count;
                        countArray[1] = Math.min(a, countArray[1]);
                    }
                    count++;
                }
            }
            count = 1;
        }
        System.out.printf("\nNumber %d (x%d)", countArray[1], countArray[0]);
    }
}
