package basics_of_software_code_development.cycle;

public class Task6 {
    public static void main(String[] args) {
        char ch;

        for (int i = 33; i < 126; i++) {
            ch = (char) i;
            System.out.printf("%d = %s\n", i, ch);
        }
    }
}
