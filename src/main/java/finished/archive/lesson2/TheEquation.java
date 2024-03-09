package finished.archive.lesson2;

import java.util.Scanner;

public class TheEquation {
    public void returnDouble() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        scanner.close();

        double c = b * a * (a + b) / (a * a);

        System.out.println(c);
    }

}
