package skillFactory;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (copyFileUsingStream("src/utf8.txt", "UTF-8", "src/win1251.txt", "windows-1251")) {
            System.out.println("Перекодировка прошла успешно!");
        }

    }

    private static boolean copyFileUsingStream(String sourceFilename, String sourceEnc,
                                               String destFilename, String descEnc) {

        try (Reader fis = new InputStreamReader(new FileInputStream(new File(sourceFilename)), sourceEnc);
             Writer fos = new OutputStreamWriter(new FileOutputStream(new File(destFilename)), descEnc)) {

            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Не удалось открыть файл " + ex.getMessage());
            return false;
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Указана неизвестная кодировка " + ex.getMessage());
            return false;
        } catch (IOException ex) {
            System.out.println("Возникла ошибка при копировании");
            return false;
        }
        return true;
    }

}