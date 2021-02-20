package by.epam.java.module_1.package_2;

// 2. Найти max{min(a, b), min(c, d)}.

public class Task_2 {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.print(Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
