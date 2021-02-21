package by.epam.java.module_3.package_1;

// 2. Замените в строке все вхождения 'word' на 'letter'.

public class Task_2 {

    public static void main(String[] args) {

        String str = "All wOrds contains words";

        str = str.replaceAll("word", "letter");

        System.out.println(str);

    }

}
