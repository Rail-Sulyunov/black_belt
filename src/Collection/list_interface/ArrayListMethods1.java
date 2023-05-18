package Collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Rail");
        arrayList1.add("Liliya");
        arrayList1.add("Imil");
        arrayList1.add(1, "Aidar");
        for (String s :
                arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();
//        for (int i = 0; i < arrayList1.size(); i++) {
//            System.out.println(arrayList1.get(i));
//        }
        arrayList1.set(1,"Masha");

        arrayList1.remove(0);

        System.out.println(arrayList1);
    }
}
