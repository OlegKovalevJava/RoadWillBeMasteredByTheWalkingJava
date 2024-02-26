package finished.archive.lesson30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher m = p.matcher("1  mymail@mail.ru");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }
}