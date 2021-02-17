package m2_algorithmization.pak_3;

import java.util.Arrays;

public class Task_1_2 {
    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        int k = 1;

        int[] mas1 = new int[n + m];
        mas1[0] = 0;
        mas1[1] = 1;
        mas1[2] = 4;
        mas1[3] = 5;

        int mas2[] = new int[m];
        mas2[0] = 2;
        mas2[1] = 3;

        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));

        for (int i = k + 1; i < k + 1 + m; i++) {
            mas1[i + m] = mas1[i];
            mas1[i] = mas2[i-k-1];
        }

        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));


    }
}
