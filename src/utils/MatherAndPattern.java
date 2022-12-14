package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatherAndPattern {
    public static void main(String[] args) {


        String fonte = "mouse da cor azul";
        String queremosIsso = "m";

        Pattern p = Pattern.compile(queremosIsso);

        Matcher m = p.matcher(fonte);

        while (m.find()) {
            System.out.println(m.start());
            System.out.println(m.group());
            System.out.println(m.end());

        }
    }
}