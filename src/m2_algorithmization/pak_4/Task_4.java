package m2_algorithmization.pak_4;

/*
4. На плоскости заданы своими координатами n точек.
Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
Указание. Координаты точек занести в массив.
 */

import java.util.Arrays;

public class Task_4 {

    public static void main(String[] args) {

        int[][] coordinates = {{5, 1}, {-11, 0}, {13, 4}, {-1, 0}};

        int[] maxDistance = getMaxDist(coordinates);
        System.out.printf("Max distance is between %s and %s", Arrays.toString(coordinates[maxDistance[0]]), Arrays.toString(coordinates[maxDistance[1]]));

    }

    private static int[] getMaxDist(int[][] coordinates) {

        double maxDistance = 0;
        double distance;
        int[] result = new int[2];

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 1; j < coordinates.length; j++) {
                distance = getDistance(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    private static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }

}
