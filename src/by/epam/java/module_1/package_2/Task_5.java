package by.epam.java.module_1.package_2;

// 5. Вычислить значение функции:

public class Task_5 {

    public static void main(String[] args) {

        double x = 4;
        double f;

        if (x <= 3) {
            f = Math.pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.print(f);
    }
}
