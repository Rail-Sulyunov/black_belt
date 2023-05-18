package Collection.list_interface;

import java.util.ArrayList;
import java.util.Collections;

public class BinerySearch {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);




//        System.out.println(arrayList);
//        int index1 = Collections.binarySearch(arrayList,12);
//        System.out.println(index1);



//        Employee emp1 = new Employee(100, "Zaur", 12345);
//        Employee emp2 = new Employee(15, "Ivan", 6542);
//        Employee emp3 = new Employee(123, "Petr", 8542);
//        Employee emp4 = new Employee(15, "Mariya", 5678);
//        Employee emp5 = new Employee(182, "Kolya", 125);
//        Employee emp6 = new Employee(15, "Sasha", 9874);
//        Employee emp7 = new Employee(250, "Elena", 1579);
//        List<Employee> employees = new ArrayList<>();
//        employees.add(emp1);
//        employees.add(emp2);
//        employees.add(emp3);
//        employees.add(emp4);
//        employees.add(emp5);
//        employees.add(emp6);
//        employees.add(emp7);
//        System.out.println(employees);
//        Collections.sort(employees);
//        System.out.println(employees);
//        int index2 = Collections.binarySearch(employees
//                , new Employee(182,"Kolya",125));
//        System.out.println(index2);


//        int []array = {-3,8,12,-8,0,5,10,1,150,-30,19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index = Arrays.binarySearch(array,150);
//        System.out.println(index);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);

        }
        return result;
    }
}
