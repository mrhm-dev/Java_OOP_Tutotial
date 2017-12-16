package chapter2.lecture4;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringSplit {
    public static void main(String[] args) {

        String languages = "Java  Javascript  Kotlin   PHP  Ruby Python C C++";
//        String languages = "Java Javascript Kotlin PHP  Ruby Python C C++";
        String[] lan = languages.split(" ");
        // Regular Expression
//        System.out.println(Arrays.toString(lan));
//        System.out.println(lan[2]);

//        System.out.println(Arrays.toString(lan));

        StringTokenizer token = new StringTokenizer(languages);

        while (token.hasMoreTokens()) {
            System.out.println(token.countTokens());
            System.out.println(token.nextToken().toUpperCase());
        }

    }
}
