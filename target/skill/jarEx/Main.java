package skill.jarEx;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Test");
        String[] files = file.list();
        System.out.println(files.length);


    }
}
