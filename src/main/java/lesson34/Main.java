package lesson34;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Instant instant = new Date().toInstant();
    }
}
