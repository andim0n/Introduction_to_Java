package m2_algorithmization.pak_3;

import m2_algorithmization.utils.MyUtil;

import java.util.Arrays;

public class Task_1_3 {
    public static void main(String[] args) {
        int n = 10;
        int m = 5;
        int k = 3;

        int[] mas1 = new int[n + m];
        int mas2[] = new int[m];

        for (int i = 0; i < n; i++) {
            mas1[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < m; i++) {
            mas2[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));

        for (int i = k + 1; i < k + 1 + m; i++) {
            mas1[i + m] = mas1[i];
            mas1[i] = 0;
        }
//        mas1[i] = mas2[i - k - 1];
//

        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));


    }
}
