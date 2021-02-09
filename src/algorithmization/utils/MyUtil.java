package algorithmization.utils;

public class MyUtil {
    public static int[] setArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
//            System.out.printf("%d ", array[i]);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.printf("\nArray:\n");
        for (int a : array) {
            System.out.printf("%d ", a);
        }
    }

    public static int[][] setDoubleArray(int m, int n) {
        int[][] array = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 10) + 1;
                System.out.printf("%d\t\t", array[i][j]);
            }
            System.out.printf("\n");
        }
        return array;
    }

    public static void printDoubleArray(int[][] array, int m, int n) {
        System.out.printf("\n\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t\t", array[i][j]);
            }
            System.out.printf("\n");
        }
    }

}
