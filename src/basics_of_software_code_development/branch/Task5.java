package basics_of_software_code_development.branch;

public class Task5 {
    public static void main(String[] args) {
        double x = 4;
        double f;
        if (x <= 3) {
            f = Math.pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.print(f);
    }
}
