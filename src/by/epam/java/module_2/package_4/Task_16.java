package by.epam.java.module_2.package_4;

/*
16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

import java.math.BigInteger;

public class Task_16 {

    public static void main(String[] args) {

        int n = 3;

        BigInteger sum = calcSum(n);
        System.out.printf("Sum of numbers with length %d with only odd digits is %d\n", n, sum);
        System.out.printf("Quantity of even digits is %d", quantityEven(sum));


    }

    static BigInteger calcSum(int n) {

        BigInteger sum = new BigInteger("0");

        for (long i = (long) Math.pow(10, n - 1) + 1; i < Math.pow(10, n); i += 2) {
            sum = sum.add(new BigInteger(String.valueOf(i)));
        }

        return sum;
    }

    static int quantityEven(BigInteger num) {
        int quantity = 0;
        String stringNum = num.toString();

        for (int i = 0; i < stringNum.length(); i++) {
            if (stringNum.charAt(i) % 2 == 0) {
                quantity++;
            }
        }
        return quantity;
    }

}
