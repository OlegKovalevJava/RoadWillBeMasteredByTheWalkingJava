package lesson25;

public class Main {
    public static void main(String[] args) {
        Math.Factorial fact = Math.getFactorial(5);
        System.out.printf("Факториал числа %d равен %d \n", fact.getKey(), fact.getResult());
    }
}