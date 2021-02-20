package by.epam.java.module_1.package_1;

/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

import java.util.Calendar;

public class Task_5 {

    public static void main(String[] args) {

        long t = System.currentTimeMillis();
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(t);

        System.out.printf("%s ч %s мин %s сек", c.get(Calendar.HOUR), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
    }
}
