package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {


        List<String>list = new ArrayList<>();
        list.add("Ok");
        list.add("Hello");
        list.add("tgkhtghotirhgihiug");

        for (String str:
             list) {
            System.out.println(str + " length - " + str.length());
        }
    }
}
