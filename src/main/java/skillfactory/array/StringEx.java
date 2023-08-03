package skillfactory.array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringEx {
    public static void main(String[] args) {

        String strDate = "Sat, April 4, 2020";
        SimpleDateFormat formatter = new SimpleDateFormat(", MMMM d, yyyy", Locale.ENGLISH);
        try {
            Date date = formatter.parse(strDate);
            System.out.println(formatter.format(date));
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

    }
}