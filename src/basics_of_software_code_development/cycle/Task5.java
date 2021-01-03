package basics_of_software_code_development.cycle;

public class Task5 {
    public static void main(String[] args) {
        int first = -3;
        int last = 3;
        double e = 13;
        double a;
        double sum = 0;

        for (int i = first; i <= last; i++) {
            a = Math.abs((1 / Math.pow(2, i)) + 1 / Math.pow(3, i));
            if (a >= e) {
                sum += a;
            }
        }
        System.out.print(sum);
    }
}
