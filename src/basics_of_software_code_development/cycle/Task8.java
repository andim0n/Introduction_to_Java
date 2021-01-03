package basics_of_software_code_development.cycle;

public class Task8 {
    public static void main(String[] args) {
        int a = 23;
        int b = 12345;
        int i;

        while (a > 0) {
            i = b;
            while (i > 0) {
                if (a % 10 == i % 10) {
                    System.out.println(a % 10);
                }
                i /= 10;
            }
            a /= 10;
        }
    }
}
