package by.epam.java.module_1.package_1;

// 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Task_3 {

    public static void main(String[] args) {

        double x = 1;
        double y = 2;
        double f = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * (Math.tan(x * y));
        System.out.printf("%.3f", f);
    }
}
