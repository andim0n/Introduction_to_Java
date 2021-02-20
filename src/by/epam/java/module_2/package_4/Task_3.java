package by.epam.java.module_2.package_4;

// 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Task_3 {
    public static void main(String[] args) {

        System.out.printf("%.1f", getHexagonArea(9));

    }

    static double getHexagonArea(double s) {
        return (3 * Math.sqrt(3) * Math.pow(s, 2)) / 2;
    }

}
