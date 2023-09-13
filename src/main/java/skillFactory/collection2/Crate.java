package skillFactory.collection2;

public class Crate<T> {

    public static <T> Crate<T> ship(T stuff) {
        System.out.println("Preparing " + stuff);
        return new Crate<T>();
    }

}