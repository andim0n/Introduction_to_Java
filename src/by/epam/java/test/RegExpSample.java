package by.epam.java.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpSample {

    public static void main(String[] args){

        String regex = "\\w{6,}@\\w+\\.\\p{Lower}{2,4}";
        String input = "адреса эл.почты:blinov@gmail.com, romanchik@bsu.by!";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("e-mail: " + matcher.group());
        }

    }
}
