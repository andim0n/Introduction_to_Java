package algorithmization.pak_2;

import algorithmization.utils.MyUtil;

public class Task9 {
    public static void main(String[] args) {
        int n = 5;
        int[][] array;
        int[] sum = new int[n];
        int max;
        int maxI = 0;
        array = MyUtil.setDoubleArray(n, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[j] += array[i][j];
            }
        }
        max = sum[0];
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > max) {
                max = sum[i];
                maxI = i;
            }
        }
        MyUtil.printArray(sum);
        System.out.printf("\nColumn with number %d has maximum size: %d", maxI, max);
    }
}
