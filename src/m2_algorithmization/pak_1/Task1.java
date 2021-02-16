package m2_algorithmization.pak_1;

public class Task1 {
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
