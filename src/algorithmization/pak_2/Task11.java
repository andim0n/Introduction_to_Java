package algorithmization.pak_2;

public class Task11 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        int[][] array = new int[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 16);
                System.out.printf("[i:%d][j:%d] %d\t\t", i, j, array[i][j]);
                if (array[i][j] == 5) {
                    count++;
                }
            }
            System.out.printf("\n");
            if (count >= 3) {
                System.out.printf("This %d line contains five %d times\n", i, count);
            }
            count = 0;
        }

    }

}
