package finished.archive.lesson3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("NUMBER ONE: ");
        final int numberOne = scanner.nextInt();

        System.out.println("NUMBER TWO: ");
        final int numberTwo = scanner.nextInt();

        System.out.println("OPERATION: ");
        String operation = scanner.nextLine();
        operation = scanner.nextLine();

        final int result;

        switch (operation) {
            case "+":
                result = numberOne + numberTwo;
                System.out.println(result);
                break;
            case "-":
                result = numberOne - numberTwo;
                System.out.println(result);
                break;
            case "*":
                result = numberOne * numberTwo;
                System.out.println(result);
                break;
            case "/":
                if (numberTwo == 0) {
                    System.out.println("ERROR");
                } else {
                    result = numberOne / numberTwo;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("ERROR OPERATION");
        }
    }
}