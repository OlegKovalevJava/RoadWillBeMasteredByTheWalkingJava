package skill.readAndWrite;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamEx {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("smallfile.txt");
        fos.write("Hello FileOutputStream world".getBytes());
        fos.close();
    }
}