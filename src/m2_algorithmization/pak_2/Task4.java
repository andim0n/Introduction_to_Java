package m2_algorithmization.pak_2;

public class Task4 {
    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = n - j;
                }
                System.out.printf("%d\t\t", array[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
