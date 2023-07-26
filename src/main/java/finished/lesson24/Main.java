package finished.lesson24;

public class Main {
    public static void main(String[] args) {

        method();

    }

    public static void method() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("TOTAL MEMORY " + runtime.totalMemory());
    }
}