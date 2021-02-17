package m2_algorithmization.pak_3;

import m2_algorithmization.utils.MyUtil;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int n = 10;
        int m = 5;
        int k = 3;
        int[] a = new int[n + m];
        int[] b;
        int num;

        System.out.printf("\nFirst aray:\n");
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
            System.out.printf("%d ", a[i]);
        }

        b = MyUtil.setArray(m);
        System.out.printf("\nSecond aray:");
        MyUtil.printArray(b);


        for (int i = k + 1; i < k + m; i++) {
            a[n + m - k + 1] = a[i + m];
            a[i + m] = a[i];
            a[i] = b[i - k];
        }

        System.out.printf("\nResult:\n");
        System.out.println(Arrays.toString(a));

    }
}
