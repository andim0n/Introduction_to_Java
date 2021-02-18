package m2_algorithmization.pak_3;
// TODO
/*
8.Даны дроби p1/q1, p2/q2, ... pn/qn (pi qi, - натуральные).
Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания
 */

public class Task_8 {
    public static void main(String[] args) {
        int n = 10;
        int[] p = {1, 2, 3, 4, 5, 6, 7};
        int[] q = {7, 6, 5, 4, 3, 2, 1};
        int commonDenominator;

        for (int i = 0; i < p.length; i++) {

        }

    }

    private static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    private static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }
}
