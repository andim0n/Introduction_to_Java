package m2_algorithmization.pak_1;

public class Task2 {
    public static void main(String[] args) {
        int z = 50;
        int count = 0;
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.printf("%d ", array[i]);
            if (array[i] > z) {
                array[i] = z;
                ++count;
            }
        }
        System.out.printf("\nNum of changes: %d\n", count);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
