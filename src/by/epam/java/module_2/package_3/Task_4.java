package by.epam.java.module_2.package_3;

/*
4. Сортировка обменами.
Дана последовательность чисел a1 <= a2 <= ... <= an.
Требуется переставить числа впорядке возрастания.
Для этого сравниваются два соседних числа ai и ai+1.
Если ai > ai+1, то делается перестановка.
Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_4 {
    public static void main(String[] args) {

        int n = 10;
        int[] a = new int[n];
        int count = 0;
        boolean isSorted = false;

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.printf("%d\t", a[i]);
        }

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    count++;
                    isSorted = false;
                }
            }
        }

        MyUtil.printArray(a);
        System.out.printf("\nQuantity of changes: %d", count);

    }

}
