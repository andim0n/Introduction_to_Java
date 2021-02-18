package m2_algorithmization.pak_4;

// 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task_7 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 10; i += 2) {
            sum += factorial(i);
            System.out.printf("Factorial of %d is %d, sum: %d\n", i, factorial(i), sum);
        }

    }

    static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}
