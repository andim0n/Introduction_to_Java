package by.epam.java.module_3.package_1;

// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.Arrays;

public class Task_1 {

    public static void main(String[] args) {

        String[] data = {"oneTwoThree", "fourSixSeven", "eightNineTenEleven"};

        for (int i = 0; i < data.length; i++) {

            data[i] = refactor(data[i]);
        }

        System.out.println(Arrays.toString(data));

    }

    static String refactor(String word) {

        StringBuilder sb = new StringBuilder();
        char[] letters = word.toCharArray();

        for (char ch : letters) {

            if (Character.isUpperCase(ch))
                sb.append("_").append(ch);
            else
                sb.append(ch);
        }
        return sb.toString().toLowerCase();
    }

}
