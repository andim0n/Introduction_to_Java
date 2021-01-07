package algorithmization.pak_1;


import algorithmization.utils.MyUtil;

public class Task4 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = MyUtil.setArray(n);
        int max = array[0];
        int min = array[0];

        for (int a : array) {
            if (a > max) {
                max = a;
            } else if (a < min) {
                min = a;
            }
        }
        System.out.printf("\nMax: %d, min: %d", max, min);
    }
}
