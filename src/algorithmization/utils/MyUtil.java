package algorithmization.utils;

public class MyUtil {
    public static int[] setArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
            System.out.printf("%d ", array[i]);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.printf("\nArray:\n");
        for (int a : array) {
            System.out.printf("%d ", a);
        }
    }
}
