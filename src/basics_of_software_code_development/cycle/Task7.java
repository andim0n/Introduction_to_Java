package basics_of_software_code_development.cycle;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.print("m = ");
        m = scanner.nextInt();
        System.out.print("n = ");
        n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            if (i > 0) {
                for (int j = 2; j <= i; j++) {
                    if ((0 == (i % j)) && !(j == i)) {
                        System.out.printf("%d / %d = %d\n", i, j, i/j);
                    }
                }
            }
        }
    }
}
