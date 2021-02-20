package by.epam.java.module_1.package_2;

/*
1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
 */

public class Task_1 {

    public static void main(String[] args) {

        int a = 40;
        int b = 50;
        int c = 180 - a - b;

        if (c > 0) {
            if ((a == 90) || (b == 90) || (c == 90)) {
                System.out.print("It is a right triangle");
            } else {
                System.out.println("Triangle exist");
            }
        } else {
            System.out.print("Triangle doesn't exist");
        }
    }
}