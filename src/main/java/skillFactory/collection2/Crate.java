package skillFactory.collection2;

public class Crate<T> {

    private T contents;

    public Crate() {
    }

    public Crate(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public static <T> Crate<T> ship(T stuff) {
        System.out.println("Preparing " + stuff);
        return new Crate<T>();
    }

}