package work_with_fille.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Zaur");
        employees.add("Ivan");
        employees.add("Elena");
        try(ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("employees1.bin"));

                ){
            outputStream.writeObject(employees);
            System.out.println("Done!!!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
