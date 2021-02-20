package by.epam.java.module_1.package_1;

/*
6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */

public class Task_6 {

    public static void main(String[] args) {

        int x = -2;
        int y = -4;

        System.out.print(((y >= 0) && (y <= 4) && (x >= -2) && (x <= 2)) || ((y >= -3) && (y <= 0) && (x >= -4) && (x <= 4)));
    }
}
