package m1_basics_of_software_code_development.branch;

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int x = 1;
        int y = 2;
        int z = 3;
        if      (  ((a >= x && b >= y) || (a >= y && b >= x))
                || ((a >= x && b >= z) || (a >= z && b >= x))
                || ((a >= y && b >= z) || (a >= z && b >= y)) ) {
            System.out.print("Success!");
        } else {
            System.out.print("Fail!");
        }
    }
}
