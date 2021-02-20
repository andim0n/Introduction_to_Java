package by.epam.java.module_1.package_3;

// 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task_8 {

    public static void main(String[] args) {

        int a = 23;
        int b = 12345;
        int i;

        while (a > 0) {
            i = b;
            while (i > 0) {
                if (a % 10 == i % 10) {
                    System.out.println(a % 10);
                }
                i /= 10;
            }
            a /= 10;
        }
    }
}
