package m2_algorithmization.pak_2;

import m2_algorithmization.utils.MyUtil;

public class Task13 {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] array;

        array = MyUtil.generateMatrix(m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k  < n; k++) {
                    if (array[j][i] > array[k][i]) {
                        int b = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = b;
                    }
                }
            }
        }
        MyUtil.printDoubleArray(array,m,n);
    }
}

