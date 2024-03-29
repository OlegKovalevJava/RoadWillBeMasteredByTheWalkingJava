package finished.archive.lesson38;

class Person implements Comparable<Person>{

    private String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }
}
