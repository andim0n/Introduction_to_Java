package m2_algorithmization.pak_4;

// 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

public class Task_11 {

    public static void main(String[] args) {

        int a = 123;
        int b = 4567;

        System.out.println(compareDigits(a, b));

    }

    static int compareDigits(int a, int b) {

        if (findLength(a) > findLength(b))
            return a;
        else
            return b;

    }

    static int findLength(int n) {

        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

}
