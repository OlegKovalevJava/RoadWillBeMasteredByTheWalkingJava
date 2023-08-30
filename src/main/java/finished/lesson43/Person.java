package finished.lesson43;

class Person {

    private String name;

    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}