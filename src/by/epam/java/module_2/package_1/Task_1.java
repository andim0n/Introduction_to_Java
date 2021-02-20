package by.epam.java.module_2.package_1;

// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task_1 {

    public static void main(String[] args) {

        int n = 5;
        int k = 3;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.printf("[%d] %d\n", i, array[i]);
            if (array[i] % k == 0) {
                System.out.printf("%d / %d = %d\n", array[i], k, array[i] / k);
            }
        }
    }
}
