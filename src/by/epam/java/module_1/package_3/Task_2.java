package by.epam.java.module_1.package_3;

// 2. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task_2 {

    public static void main(String[] args) {

        int a = -5;
        int b = 5;
        int h = 1;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i <= 2) {
                y = 0 - i;
            } else {
                y = i;
            }
            System.out.printf(" x = %d, y = %d \n", i, y);
        }
    }
}
