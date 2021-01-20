package algorithmization.pak_2;

public class Task7 {
    public static void main(String[] args) {
        int n = 5;
        double[][] array = new double[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (Math.sin(Math.pow(i, 2) - Math.pow(j, 2))) / n;
                System.out.printf("%.3f\t\t", array[i][j]);
                if (array[i][j] > 0) {
                    count++;
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("There are %d positive numbers", count);
    }
}
