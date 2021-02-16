package m1_basics_of_software_code_development.linear;

import java.util.Calendar;

public class Task5 {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(t);
        System.out.printf("%s ч %s мин %s сек", c.get(Calendar.HOUR), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
    }
}
