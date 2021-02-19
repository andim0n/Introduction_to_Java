package m2_algorithmization.pak_2;

import m2_algorithmization.utils.MyUtil;

import java.util.Random;

public class Task14 {

    public static void main(String[] args) {

        int n = 10;
        int[][] matrix = new int[n][n];
        int count = 0;
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {

                if ((count < i + 1) && (rand.nextBoolean())) {
                    matrix[j][i] = 1;
                    count++;
                } else {
                    matrix[j][i] = 0;
                }
            }
            if (count != (i + 1)) {
                i--;
            }

        }
        MyUtil.printMatrix(matrix);
    }
}
