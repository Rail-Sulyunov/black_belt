package work_with_fille;

import java.io.*;

public class CopeEx2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream =
                     new FileInputStream("C:\\Users\\Home\\Desktop\\7.jpg");
             FileOutputStream outputStream =
                     new FileOutputStream("7.jpg");

        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }

            System.out.println("Done!!!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
