package m2_algorithmization.pak_4;

/*
13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.
 */

public class Task_13 {

    public static void main(String[] args) {

        int n = 50;

        printTwins(n);

    }

    static void printTwins(int n) {

        for (int i = n; i <= 2 * n; i++) {
            if (isPrime(i)) {
                if (isPrime(i + 2))
                    System.out.printf("%d and %d are twins\n", i, i + 2);
            }
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
