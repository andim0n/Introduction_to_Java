package by.epam.java.module_3.package_1;

// 4. В строке найти количество чисел.

public class Task_4 {

    public static void main(String[] args) {

        String text = "1 22 333 4444;5s6po777  8888";
        char[] array = text.toCharArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if ((Character.isDigit(array[i]))) {
                while (Character.isDigit(array[i]) && i < array.length - 1) {
                    i++;
                }
                count++;
            }
        }

        System.out.println(count);


    }

}
