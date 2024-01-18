package finished.lesson52;

public class Main {
    public static void main(String[] args) {
        Runnable r = (args.length > 0 ?
                () -> System.out.println("Hello " + args[0] + "!") :
                () -> System.out.println("Hello World"));
    }
}