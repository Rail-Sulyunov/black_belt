package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String myString = "48245679987654131230892;" +
                "65987879987654131029652;" +
                "45987365487654130826783";
        //03/25 1234 5678 9123  (987)    Bank kart

        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

//        String myNewString = matcher.replaceAll
//                ("$5/$6 $1 $2 $3 $4 ($7)");
//
//        System.out.println(myNewString);

        while (matcher.find()){
            System.out.println(matcher.group(7));
        }
    }
}
