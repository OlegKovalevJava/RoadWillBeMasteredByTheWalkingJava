package skill.bigDec;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        var a = new BigDecimal("10");

        var b = new BigDecimal("10.000");

        System.out.println(a.compareTo(b)==0);
    }

}