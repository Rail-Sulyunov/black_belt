package work_with_fille;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("test10.txt", "rw")) {

            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);
            long pos = file.getFilePointer();
            System.out.println(pos);
//            file.seek(0);
//            file.writeBytes("!!!");
            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\t\t\tWilliam Butler Teats.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
