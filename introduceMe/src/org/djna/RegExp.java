package org.djna;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    public static void main(String[] args) {
        String target = "one,two,three";
        String regex = "two";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(target);

        if( matcher.find() ) {
            System.out.printf("We have a match at offset %d\n", matcher.start());
        }
    }
}
