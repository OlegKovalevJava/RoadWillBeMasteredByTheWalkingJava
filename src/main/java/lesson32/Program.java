package lesson32;

import java.io.*;

public class Program {
    public static void main(String[] args) {

        String text = "Hello world!";
        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}