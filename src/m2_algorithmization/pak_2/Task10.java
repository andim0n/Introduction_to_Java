package m2_algorithmization.pak_2;

import m2_algorithmization.utils.MyUtil;

public class Task10 {
    public static void main(String[] args) {
        int n = 5;
        int[][] array;

        array = MyUtil.generateMatrix(n, n);

        for (int i = 0; i < n; i++) {
            if (array[i][i] > 0) {
                System.out.printf("%d\t", array[i][i]);
            }
        }

    }
}