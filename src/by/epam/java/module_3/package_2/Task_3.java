package by.epam.java.module_3.package_2;

// 3. Проверить, является ли заданное слово палиндромом

public class Task_3 {

    public static void main(String[] args) {

        System.out.println(isPalindrom("racecar"));
        System.out.println(isPalindrom("racecars"));

    }

    private static boolean isPalindrom(String word) {

        StringBuilder sb = new StringBuilder(word);

        return word.contentEquals(sb.reverse());

    }
}
