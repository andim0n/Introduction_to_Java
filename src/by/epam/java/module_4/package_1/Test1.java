package by.epam.java.module_4.package_1;

/*
 * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */

public class Test1 {

    private int a;
    private int b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void printSum() {
        System.out.println(a + b);
    }

    public void printMax() {
        System.out.println(Math.max(a, b));
    }
}
