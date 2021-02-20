package by.epam.java.module_1.package_3;

// 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task_6 {

    public static void main(String[] args) {

        char ch;

        for (int i = 33; i < 126; i++) {
            ch = (char) i;
            System.out.printf("%d = %s\n", i, ch);
        }
    }
}
