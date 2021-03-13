package by.epam.java.test;

public class WrapperQuestion {
    public static void main(String[] args) {

        Integer x = Integer.MAX_VALUE;
        System.out.println(x);

        Integer y = test(x);
        System.out.println(y);

        System.out.println(x.equals(y));


    }

    static Integer test(Integer x) {
        return x;
    }
}
