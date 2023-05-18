package Collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Rail");
        arrayList1.add("Liliya");
        arrayList1.add("Imil");
        System.out.println(arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("!!!");
//        arrayList2.add("???");
//        arrayList1.addAll(1,arrayList2);
//        int a = arrayList1.indexOf("Imil");
//        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("Imil"));

    }
}