package m2_algorithmization.pak_4;

// 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task_6 {

    public static void main(String[] args) {

        int a = 8;
        int b = 15;
        int c = 49;

        System.out.printf("%d, %d, %d - %b", a, b, c, isMutuallyPrime(a, b, c));

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

    static boolean isMutuallyPrime(int a, int b, int c) {
        if (gcd(gcd(a, b), c) == 1)
            return true;
        else return false;

    }

}
