package by.epam.java.module_2.package_4;

/*
14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу.
Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

public class Task_14 {

    public static void main(String[] args) {

        int k = 2000;

        printArmNum(k);

    }

    static void printArmNum(int k) {
        for (int i = 1; i < k; i++) {
            if (isArmNum(i))
                System.out.println(i);
        }
    }

    static boolean isArmNum(int num) {
        int pow = findLength(num);
        int sum = 0;
        int tmp = num;

        while (num > 0) {
            sum = (int) (sum + Math.pow((num % 10), pow));
            num /= 10;
        }

        if (sum == tmp)
            return true;
        else
            return false;
    }

    static int findLength(int n) {

        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }

}
