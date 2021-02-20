package by.epam.java.module_2.package_4;

/*
17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько такихдействий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.
 */

public class Task_17 {

    public static void main(String[] args) {

        int num = 123;

        System.out.println(countSub(num));


    }

    static int countSub(int num) {
        int count = 0;

        while (num > 0) {
            num -= sumDigits(num);
            count++;
        }
        return count;
    }

    static int sumDigits(int num) {

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
