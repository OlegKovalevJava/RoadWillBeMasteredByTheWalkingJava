package skillFactory.exception;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            copyFileUsingStream("src/utf.txt", "UTF-8", "src/win1251.txt", "windows-1251");
            System.out.println("Перекодировка прошла успешно");
        } catch (ConvertException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void copyFileUsingStream(String sourceFilename, String sourceEnc,
                                            String destFilename, String destEnc) throws ConvertException {
        try (Reader fis = new InputStreamReader(new FileInputStream(new File(sourceFilename)), sourceEnc);
             Writer fos = new OutputStreamWriter(new FileOutputStream(new File(destFilename)), destEnc)) {

            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (FileNotFoundException ex) {
            throw new ConvertException("Не удалось открыть файл " + ex.getMessage());
        } catch (UnsupportedEncodingException ex) {
            throw new ConvertException("Указана неизвестная кодировка " + ex.getMessage());
        } catch (IOException ex) {
            throw new ConvertException("Возникла ошибка при копировании");
        }
    }

}