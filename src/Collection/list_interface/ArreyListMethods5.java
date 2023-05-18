package Collection.list_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArreyListMethods5 {
    public static void main(String[] args) {


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Rail");
        arrayList1.add("Liliya");
        arrayList1.add("Imil");
        arrayList1.add("Zaur");
        arrayList1.add("Elena");

        List<Integer>list1 = List.of(3,8,13);
        System.out.println(list1);
//        list1.add(100);

        List<String>list2 = List.copyOf(arrayList1);
        System.out.println(list2);


//        System.out.println(arrayList1);
//        String[] array = arrayList1.toArray(new String[0]);
//        for (String a:
//             array) {
//            System.out.println(a);
//        }

//        List<String>myList = arrayList1.subList(1,4);
//        System.out.println(myList);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Igor");
//        arrayList2.add("Liliya");
//        arrayList2.add("Rail");

//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);
//        boolean result  = arrayList1.containsAll(arrayList2);
//        System.out.println(result);
    }
}