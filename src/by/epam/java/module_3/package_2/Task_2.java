package by.epam.java.module_3.package_2;

// 2. В строке вставить после каждого символа 'a' символ 'b'.

public class Task_2 {

    public static void main(String[] args) {

        String str = "abcdeaghijaklaa";

        StringBuilder sb = new StringBuilder();
        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 'a') {
                sb.append(a[i]).append("b");
            } else {
                sb.append(a[i]);
            }
        }
        System.out.println(sb);

    }
}
