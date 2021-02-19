package m2_algorithmization.pak_4;

/*
Задан массив D. Определить следующие суммы:
D[1] + D[2] + D[3];
D[3] + D[4] + D[5];
D[4] + D[5] + D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */

public class Task_8 {

    public static void main(String[] args) {

        int[] d = {0, 1, 2, 3, 4, 5, 6, 7};

        System.out.println(sum(d, 1, 3));
        System.out.println(sum(d, 3, 5));
        System.out.println(sum(d, 4, 6));

    }

    static int sum(int[] array, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += array[i];
        }
        return sum;
    }
}
