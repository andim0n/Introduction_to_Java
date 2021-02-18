package m2_algorithmization.pak_3;

import m2_algorithmization.utils.MyUtil;

public class Task_1 {
    public static void main(String[] args) {
        int n = 3;
        int m = 10;
        int k = 1;

        int[] mas1 = new int[n + m];
        int mas2[] = new int[m];

        for (int i = 0; i < n; i++) {
            mas1[i] = i;
        }
        for (int i = 0; i < m; i++) {
            mas2[i] = i + 100;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", mas1[i]);
        }

        MyUtil.printArray(mas2);

        for (int i = n + m - 1; i >= k + 1 + m; i--) {
            mas1[i] = mas1[i - m];
        }

        for (int i = k + 1; i < k + 1 + m; i++) {
            mas1[i] = mas2[i - k - 1];
        }

        MyUtil.printArray(mas1);
    }
}
