package skillFactory.collection;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Iterable iterable = new Iterable() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };

        Iterator iterator = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }

}