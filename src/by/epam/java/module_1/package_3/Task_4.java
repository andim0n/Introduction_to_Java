package by.epam.java.module_1.package_3;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Task_4 {

    public static void main(String[] args) {

        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {
            result = result.multiply(new BigInteger("" + i * i));
        }

        System.out.print(result);
    }
}
