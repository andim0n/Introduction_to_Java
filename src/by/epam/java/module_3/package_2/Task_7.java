package by.epam.java.module_3.package_2;
// todo regexp
/* 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cdedef", то должно быть выведено "abcdef".
 */

public class Task_7 {

    public static void main(String[] args) {

        String input = " ddo  oooonn  nee  eee ";
        System.out.println(input.replaceAll("(.)\\1{1,}", "$1").replaceAll(" ", ""));

    }
}
