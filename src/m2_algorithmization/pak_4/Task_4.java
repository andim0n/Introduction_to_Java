package m2_algorithmization.pak_4;

/*
4. На плоскости заданы своими координатами n точек.
Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
Указание. Координаты точек занести в массив.
 */

public class Task_4 {

    public static void main(String[] args) {

        int[][] point = {{1, 2}, {-3, 4}, {5, -6}};
        System.out.println(findDistance(0, 1, 2, -2));

    }

    static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

}
