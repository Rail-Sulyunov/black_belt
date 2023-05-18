package Collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String>arrayList1 = new ArrayList<>(120);
        arrayList1.add("Rail");
        arrayList1.add("Liliya");
        arrayList1.add("Imil");
        System.out.println(arrayList1);

        List<String>arrayList2 = new ArrayList<>();

        ArrayList<String>arrayList3 = new ArrayList<>(arrayList1);
    }
}
