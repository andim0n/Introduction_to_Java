package by.epam.java.module_1.package_3;

/*
5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
модуль которых больше или равен заданному е. Общий член ряда имеет вид:
 */

public class Task_5 {

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
