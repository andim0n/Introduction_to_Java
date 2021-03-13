package by.epam.java.test;

public class StringSample {

    public static void main(String[] args) {


        String emojiString = "\uD83D";
        //На один emojiString приходится 2 чара (т.к. не влезает в 16 бит)
        System.out.println(emojiString.codePoints().count()); //1
        System.out.println(emojiString.chars().count()); //2

    }

}
