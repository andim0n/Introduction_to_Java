package by.epam.java.module_1.package_2;

/*
4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.

 */

public class Task_4 {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int x = 1;
        int y = 2;
        int z = 3;

        if (((a >= x && b >= y) || (a >= y && b >= x))
                || ((a >= x && b >= z) || (a >= z && b >= x))
                || ((a >= y && b >= z) || (a >= z && b >= y))) {
            System.out.print("Success!");
        } else {
            System.out.print("Fail!");
        }
    }
}
