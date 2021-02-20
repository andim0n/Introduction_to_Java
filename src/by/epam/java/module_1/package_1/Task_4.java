package by.epam.java.module_1.package_1;

/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task_4 {

    public static void main(String[] args) {

        Double a = 111.222;

        System.out.print(new StringBuilder(a.toString()).reverse());
    }
}
