package m2_algorithmization.pak_1;

import m2_algorithmization.utils.MyUtil;

public class Task5 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = MyUtil.setArray(n);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.printf("\n%d > %d ", array[i], i);
            }
        }
    }
}
