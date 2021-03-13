package by.epam.java.module_3.package_2;

/*
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать
 */

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        String longest = words[0];

        for (String str : words) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        System.out.println(longest);
    }

}
