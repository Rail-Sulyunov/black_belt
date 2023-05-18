package nected_classes.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math m =new Math() {
            int c =10;
            void abc(){}
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m.doOperation(3,6));
        System.out.println(m2.doOperation(5,4));
    }

}
interface Math{
    int doOperation(int a, int b);
}