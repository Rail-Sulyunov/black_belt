package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        int a = GetMethod.getSecondElements(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("c");
        String b = GetMethod.getSecondElements(al2);
        System.out.println(b);

    }
}

class GetMethod {
    public static <T> T getSecondElements(ArrayList<T> al) {
        return al.get(1);
    }
}
