package algorithmization.pak_1;

import algorithmization.utils.MyUtil;

public class Task6 {
    public static void main(String[] main) {
        int n = 10;
        int[] array = MyUtil.setArray(n);
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
        }
    }
}