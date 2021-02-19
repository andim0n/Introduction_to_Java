package m2_algorithmization.pak_3;

/*
8.Даны дроби p1/q1, p2/q2, ... pn/qn (pi qi, - натуральные).
Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания
 */

import m2_algorithmization.utils.MyUtil;

public class Task_8 {
    public static void main(String[] args) {

        int[] p = {1, 2, 3, 5};
        int[] q = {12, 6, 5, 8};
        int commonDenominator = lcm(q[0], q[1]);
        int num;
        int tmp;

        // Нахождение нок для трех и более дробей
        if (q.length > 2) {
            for (int i = 2; i < q.length; i++) {
                commonDenominator = lcm(commonDenominator, q[i]);
            }
        }

        // Домножение числителя и знаменателя
        for (int i = 0; i < q.length; i++) {
            num = commonDenominator / q[i];
            q[i] = q[i] * num;
            p[i] = p[i] * num;
        }

        // Сортировка
        for (int i = 0; i < p.length - 1; i++) {

            if (p[i] > p[i + 1]) {

                tmp = p[i];
                p[i] = p[i + 1];
                p[i + 1] = tmp;

                if (i == 0)
                    i--;
                else
                    i -= 2;
            }
        }

        MyUtil.printArray(p);
        MyUtil.printArray(q);

    }

    static int gcd(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return Math.abs(a);
    }

    static int lcm(int a, int b) {
        return (a * b) / (gcd(a, b));
    }
}
