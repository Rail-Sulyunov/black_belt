package Collection.map_interface;

import java.util.*;

public class TreeMapEx {

    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Rail", "Sulyunov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);

        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(9.1, st7);

//        Student st8 = new Student("Elena", "Sidorova", 4);
//        System.out.println(treeMap.containsKey(st8));

//        System.out.println(treeMap.headMap(7.3));
//        System.out.println(treeMap.lastEntry());
////        System.out.println(treeMap.get(6.4));
////        treeMap.remove(5.8);
////        System.out.println(treeMap);
////        System.out.println(treeMap.descendingMap());


    }
}
