package org.example.finished.lesson32;

import java.io.*;

public class Program {
    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream("notes.txt");
             FileOutputStream fos = new FileOutputStream("notes_new.txt")) {
            byte[] buffer = new byte[256];
            int count;
            while ((count = fin.read(buffer)) != -1) {
                fos.write(buffer, 0, count);
            }
            System.out.println("File has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}