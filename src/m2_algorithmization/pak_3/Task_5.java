package m2_algorithmization.pak_3;
// TODO binary search
/*
5. Сортировка вставками.
Дана последовательность чисел a1,a2,...,an.
Требуется переставить числа в порядке возрастания.
Делается это следующим образом. Пусть a1,a2,...,ai - упорядоченная последовательность, т. е. a1 <= a2 <= ... <= an.
Берется следующее число a[i+1] a и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей.
Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
Двоичный поиск оформить в виде отдельной функции.
 */

public class Task_5 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 7, 6, 10, 9, 13, 12};
        int index = 0;

        // Найдем первый элемент, идущий после упорядоченной последовательности
        for (int i = 0; i < a.length; i++) {
            if (a[i + 1] < a[i]) {
                index = i + 1;
                break;
            }
        }
        System.out.println(index);

    }

    public static int binarySearch(int[] a, int key, int min, int max) {
        if (max < min) {
            return -1;
        }

        int midPoint = (int) max - min / 2;

        if (a[midPoint] < key)
            binarySearch(a, key, midPoint + 1, max);
        else if (a[midPoint] > key)
            binarySearch(a, key, min, midPoint - 1);

        return midPoint;

    }

}
