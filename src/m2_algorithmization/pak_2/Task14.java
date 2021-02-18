package m2_algorithmization.pak_2;

import m2_algorithmization.utils.MyUtil;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int m = 5;
        int n = m;
        int[][] matrix = new int[m][n];
        int count = 0;
        Random rand = new Random();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
//                int number = (int) Math.round(Math.random() * (i + 1));
//                if ((count < i + 1) && (number >= 1)) {
                // todo correct random
                if ((count < i + 1) && (rand.nextBoolean()) && (matrix[j][i] != 1)) {
                    matrix[j][i] = 1;
                    count++;
                } else {
                    matrix[j][i] = 0;
                }
            }
            if (count == (i + 1)) {
                count = 0;
            } else {
                i--;
            }

        }
        MyUtil.printMatrix(matrix);

    }
}
