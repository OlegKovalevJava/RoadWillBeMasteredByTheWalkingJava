package lesson32;

import java.io.*;

public class ProgramIn {
    public static void main(String[] args) {

        String text = "Hello";

        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
            //fos.write(buffer[0];
            System.out.println("The file has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}