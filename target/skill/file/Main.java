package skill.file;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Test", "dirTest.txt");
        long longFile = file.length();
        System.out.println(longFile);

    }
}