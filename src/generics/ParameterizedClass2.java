package generics;

import javax.print.attribute.standard.MediaSize;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 20);
        System.out.println("value1 = " + pair.getFirstValue1() +
                ",  value2 = " + pair.getSecondValue2());
        Pair<Integer, Integer> pair1 = new Pair<>(45, 23);
        System.out.println("value1 = " + pair1.getFirstValue1() +
                ",  value2 = " + pair1.getSecondValue2());
        OtherPair<String> otherPair = new OtherPair<>("ok","hello");
        System.out.println("value1 = " + otherPair.getFirstValue1() +
                ",  value2 = " + otherPair.getSecondValue2());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue1() {
        return value1;
    }

    public V2 getSecondValue2() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue1() {
        return value1;
    }

    public V getSecondValue2() {
        return value2;
    }
}