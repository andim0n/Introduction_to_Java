package by.epam.java.module_1.package_3;

/*
1. Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter positive number: ");

        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum += i;
        }

        System.out.print(sum);
    }
}
