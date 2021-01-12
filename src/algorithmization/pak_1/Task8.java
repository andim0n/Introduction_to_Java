package algorithmization.pak_1;

import algorithmization.utils.MyUtil;

public class Task8 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = MyUtil.setArray(n);
        int min = array[0];
        int count = 0;

        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        System.out.printf("\nMin: %d", min);

        for (int a : array) {
            if (a == min) {
                count++;
            }
        }
        System.out.printf("\nCount: %d", count);

        int[] newArray = new int[n - count];
        int i = 0;

        for (int a : array) {
            if (!(a == min)) {
                newArray[i] = a;
                i++;
            }
        }

        MyUtil.printArray(newArray);
    }
}

