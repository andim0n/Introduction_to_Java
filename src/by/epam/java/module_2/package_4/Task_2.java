package by.epam.java.module_2.package_4;

// 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task_2 {
    public static void main(String[] args) {

        System.out.println(gcd(78,294,570,36));
        System.out.println(gcd(-81,360,738,-135));

    }

    static int gcd(int a, int b, int c, int d) {
        return gcd(gcd(a, b), gcd(c, d));
    }

    static int gcd(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return Math.abs(a);
    }

}
