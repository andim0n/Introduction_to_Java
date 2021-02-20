package by.epam.java.module_2.package_4;

/*
15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Task_15 {

    public static void main(String[] args) {

        int n = 5;

        digitsInOrder(n);

    }

    static void digitsInOrder(int n) {

        for (int i = 1; i <= 10 - n; i++) {
            for (int j = i; j < i + n; j++)
                System.out.print(j);
            System.out.println();
        }

    }

}
