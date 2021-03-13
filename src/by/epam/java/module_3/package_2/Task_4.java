package by.epam.java.module_3.package_2;

// 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task_4 {

    public static void main(String[] args) {

        String str1 = "информатика";
        String str2 = "торт";
        StringBuilder sb = new StringBuilder();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (b[i] == a[j]) {
                    sb.append(a[j]);
                }

            }
        }

        System.out.println(sb);

    }

}
