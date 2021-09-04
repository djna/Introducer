package org.djna;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    public static void main(String[] args) {
        String target = "one,two,three";
        String regex = "(.+),.+,(.+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(target);

        if( matcher.find() ) {
            System.out.printf("We have a match at %d\n", matcher.start());
            for ( int g = 1; g <= matcher.groupCount(); g++){
                System.out.printf("group %d=%s\n", g, matcher.group(g));
            }
        }
    }
}
