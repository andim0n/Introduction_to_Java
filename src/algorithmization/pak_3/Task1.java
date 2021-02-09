package algorithmization.pak_3;

import algorithmization.utils.MyUtil;

public class Task1 {
    public static void main(String[] args) {
        int n = 10;
        int m = 5;
        int k = 3;
        int[] a = new int[n + m];
        int[] b;
        int num;

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
        }
        MyUtil.printArray(a);
        b = MyUtil.setArray(m);
        MyUtil.printArray(b);

        for (int i = 0; i < n + m; i++) {
            if (i == k) {
                for (int j = 0; j < m; j++) {
                    num = a[i];
                    a[i] = b[j];
                    b[j] = num;
                }
                for (int j = 0; j < m; j++) {
                    a[i] = b[j];
                }
            }
        }
        MyUtil.printArray(a);

    }
}
