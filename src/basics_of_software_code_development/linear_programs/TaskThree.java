package basics_of_software_code_development.linear_programs;

public class TaskThree {
    public static void main(String[] args) {
        double x = 1;
        double y = 2;
        double f = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * (Math.tan(x * y));
        System.out.printf("%.3f", f);
    }
}
