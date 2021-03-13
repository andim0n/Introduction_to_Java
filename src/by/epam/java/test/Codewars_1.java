package by.epam.java.test;

public class Codewars_1 {
    public static void main(String[] args) {


        deleteDuplicate("aaabbbccc");

    }

    private static void deleteDuplicate(String word) {
        StringBuilder sb = new StringBuilder();
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i + 1]) {
                continue;
            } else {
                sb.append(array[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
