package algorithmization.pak_2;

import algorithmization.utils.MyUtil;

public class Task12 {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] array;

        array = MyUtil.setDoubleArray(m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i][j] > array[i][k]) {
                        int b = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = b;
                    }
                }
            }
        }
        MyUtil.printDoubleArray(array,m,n);
    }
}
