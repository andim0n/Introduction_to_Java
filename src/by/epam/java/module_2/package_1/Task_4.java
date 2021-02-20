package by.epam.java.module_2.package_1;

// 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;

public class Task_4 {

    public static void main(String[] args) {

        double[] a = {1.1, 2.2, 3.3, 4.4, 0.5, 1, 2, 3};
        double max = a[0];
        double min = a[0];
        int maxI = 0;
        int minI = 0;
        double tmp;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxI = i;
            }
            if (a[i] < min) {
                min = a[i];
                minI = i;
            }
        }

        tmp = a[maxI];
        a[maxI] = a[minI];
        a[minI] = tmp;

        System.out.println(Arrays.toString(a));
    }
}
