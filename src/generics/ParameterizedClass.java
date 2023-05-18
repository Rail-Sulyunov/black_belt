package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info = new Info<>("Rail");
//        System.out.println(info);
        Info<Integer> info1 = new Info<>(34);
        System.out.println(info1);

        Info<Double> info2 = new Info<>(3.14);
        System.out.println(info2);
    }

}
class Info <T extends Number>{
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }
}