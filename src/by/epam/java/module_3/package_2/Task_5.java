package by.epam.java.module_3.package_2;

// 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task_5 {

    public static void main(String[] args) {

        String str = "abracAdabra";
        int count = 0;
        char[] a = str.toLowerCase().toCharArray();

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 'a') {
                count++;
            }
        }

        System.out.println(count);

    }
}
