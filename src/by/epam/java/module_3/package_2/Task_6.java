package by.epam.java.module_3.package_2;

// 6. Из заданной строки получить новую, повторив каждый символ дважды.

public class Task_6 {

    public static void main(String[] args) {

        String str = "abcdefg";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(ch).append(ch);
        }

        System.out.println(sb);
    }
}
