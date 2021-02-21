package by.epam.java.module_3.package_1;

/*
 *  5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 *  Крайние пробелы в строке удалить.
 */

public class Task_5 {

    public static void main(String[] args) {

        String text = "  One two  three   four    five !  ";
        StringBuilder sb = new StringBuilder();

        boolean flag = false;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                if (!flag)
                    sb.append(" ");
                flag = true;
            } else {
                sb.append(text.charAt(i));
                flag = false;
            }
        }

        System.out.println(sb.toString().trim());
    }

}
