package basics_of_software_code_development.branching_programs;

public class Task2 {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int min_ab;
        int min_cd;

        if (a < b) {
            min_ab = a;
        } else {
            min_ab = b;
        }

        if (c < d) {
            min_cd = c;
        } else {
            min_cd = d;
        }

        if (min_ab > min_cd) {
            System.out.print(min_ab);
        } else {
            System.out.print(min_cd);
        }

    }
}
