package by.epam.java.module_2.package_4;

/*
1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
NOK(A,B) = (A*B) / (NOD(A,B)
 */
public class Task_1 {
    public static void main(String[] args) {

        System.out.println(lcm(16, 20));

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

    static int lcm(int a, int b) {
        return (a * b) / (gcd(a, b));
    }

}
