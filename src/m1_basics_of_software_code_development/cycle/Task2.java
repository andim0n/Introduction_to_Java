package m1_basics_of_software_code_development.cycle;

public class Task2 {
    public static void main(String[] args) {
        int a = -5;
        int b = 5;
        int h = 1;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i <= 2) {
                y = 0 - i;
            } else {
                y = i;
            }
            System.out.printf(" x = %d, y = %d \n", i, y);
        }
    }
}
