package basics_of_software_code_development.branching_programs;

public class Task1 {
    public static void main(String args[]) {
        int a = 40;
        int b = 50;
        int c = 180 - a - b;
        if (c > 0) {
            if ((a == 90) || (b == 90) || (c == 90)) {
                System.out.print("It is a right triangle");
            } else {
                System.out.println("Triangle exist");
            }
        } else {
            System.out.print("Triangle doesn't exist");
        }
    }
}