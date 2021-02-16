package m2_algorithmization.pak_1;

public class Task3 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        int negative = 0;
        int positive = 0;
        int zero = 0;

        for (int a : array) {
            a = (int) (Math.random() * 100 - 50);
            System.out.printf("%d ", a);
            if (a > 0) {
                positive++;
            } else if (a < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.printf("\nPositive: %d\nNegative: %d\nZero: %d", positive, negative, zero);
    }
}
