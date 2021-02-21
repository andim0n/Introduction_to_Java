package by.epam.java.module_3.package_1;

// 3. В строке найти количество цифр.

public class Task_3 {

    public static void main(String[] args) {

        String text = "a1b2c3d4, e5f6";
        char ch;
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' ||
                    ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9')
                count++;

        }
        System.out.println(count);

    }

}
