package by.epam.java.module_2.package_3;

import by.epam.java.module_2.util.MyUtil;

public class Task_5_1 {

    public static void main(String[] args) {

        int[] a = {8, 7, 6, 5, 4, 3, 2, 1, 0};

        sort(a);
    }

    static int[] insert(int[] a, int oldPos, int newPos) {
        int tmp = a[oldPos];
        for (int i = oldPos; i > newPos; i--) {
            a[i] = a[i - 1];
        }
        a[newPos] = tmp;
        return a;
    }

    static void sort(int[] a) {

        int newPos;

        while (!isSorted(a)) {

            for (int i = 0; i < a.length; i++) {
                newPos = binarySearch(a, a[i], i) + 1;
                System.out.printf("\n[%d]%d >> [%d]", i, a[i], newPos);
                a = insert(a, i, newPos);
                MyUtil.printArray(a);
            }
        }
    }


    static boolean isSorted(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;

        }
        return true;
    }

    public static int binarySearch(int[] a, int key, int right) {

        int index = 0;
        int left = 0;
//        right--;

        while (left <= right) {

//            System.out.printf("\nfrom %d to %d", left, right);

            index = (right + left + 1) / 2;

            if (key == a[index]) {
//                System.out.printf("\n%d = [%d]%d", key, index, a[index]);
                break;
            } else if (key < a[index]) {
//                System.out.printf("\n%d < [%d]%d", key, index, a[index]);
                index--;
                right = index;
            }

            if (key > a[index]) {
//                System.out.printf("\n%d > [%d]%d", key, index, a[index]);
                index++;
                left = index;
            }

        }

        return index;
    }


}
