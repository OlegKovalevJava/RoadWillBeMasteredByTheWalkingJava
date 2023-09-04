package skillFactory;

import skillFactory2.Printable;

public class LambdaApp {
    public static void main(String[] args) {

        Printable printer = r -> System.out.println(r);
        Printable printer2 = s -> System.out.println(s);
        printer.print("Hello Java");
        printer.print("Hello Java");
        printer2.print("No");
        printer2.print("No");

    }
}