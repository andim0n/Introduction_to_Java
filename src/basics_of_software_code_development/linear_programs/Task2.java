package basics_of_software_code_development.linear_programs;

import java.lang.Math;

class Task2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        double x = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));
        System.out.print(x);
    }
}
