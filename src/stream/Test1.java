package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("Ok");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        List<Integer> list2 = list.stream().map(element -> element.length()) // 6 8 2 4
                .collect(Collectors.toList());
//        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
       array = Arrays.stream(array).map(el
                -> {
            if (el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
//        System.out.println(Arrays.toString(array));

        Set<String>set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("ok");
        set.add("poka");
        System.out.println(set);
             //6  9  2  4
        Set<Integer> set2 =set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> set3 =set.stream().map(e -> e.length()).collect(Collectors.toList());

        System.out.println(set3);

    }
}
