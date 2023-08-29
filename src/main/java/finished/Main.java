package finished;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Date date = new Date();

        System.out.println(formater.format(date));

    }
}