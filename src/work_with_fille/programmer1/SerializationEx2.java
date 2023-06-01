package work_with_fille.programmer1;

import java.io.*;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan", "white");
        Employee employee = new Employee("Mariya"
                ,"It"
                ,28
               , 500, car);

        try(ObjectOutputStream outputStreamStream =
                new ObjectOutputStream( new FileOutputStream("employees2.bin")

                )){
            outputStreamStream.writeObject(employee);
            System.out.println("Done!!!");



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
