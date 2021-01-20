package algorithmization.pak_2;

import algorithmization.utils.MyUtil;

public class Task13 {
    public static void main(String[] args) {
        int m = 5;
        int n = 7;
        int[][] array;

        array = MyUtil.setDoubleArray(m, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    if (array[j][i] > array[j][k]) {
                        int b = array[j][i];
                        array[j][i] = array[j][k];
                        array[j][i] = b;
                    }
                }
            }
        }
        MyUtil.printDoubleArray(array, m, n);
    }
}

