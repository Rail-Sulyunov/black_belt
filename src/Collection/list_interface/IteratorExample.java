package Collection.list_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Rail");
        arrayList1.add("Liliya");
        arrayList1.add("Imil");
        arrayList1.add("Zaur");
        arrayList1.add("Elena");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);

    }
}
