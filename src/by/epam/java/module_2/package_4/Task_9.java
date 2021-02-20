package by.epam.java.module_2.package_4;

/*
9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */

public class Task_9 {

    public static void main(String[] args) {

        int x = 5;
        int y = 4;
        int z = 3;
        int t = 6;

        System.out.println(calcSquare(x, y, z, t));

    }

    static double calcSemiPer(int x, int y, int z, int t) {
        return (x + y + z + t) / 2;
    }

    static double calcSquare(int x, int y, int z, int t) {
        double semiPer = calcSemiPer(x, y, z, t);
        return Math.sqrt((semiPer - x) * (semiPer - y) * (semiPer - z) * (semiPer - t));
    }

}
