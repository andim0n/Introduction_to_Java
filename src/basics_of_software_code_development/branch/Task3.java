package basics_of_software_code_development.branch;

public class Task3 {
    public static void main(String[] args) {
        int x1 = -1;
        int y1 = -2;

        int x2 = -3;
        int y2 = -4;

        int x3 = -5;
        int y3 = -6;

        if ((x3 - x1) * (y2 - y1) - (y3 - y1) * (x2 - x1) == 0) {
            System.out.print("All points are located on a straight line");
        } else {
            System.out.print("Points are not located on a straight line");
        }
    }
}
