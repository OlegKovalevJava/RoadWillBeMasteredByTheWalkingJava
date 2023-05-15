package lesson20;

public class Person {
    public Person clone() throws CloneNotSupportedException{
        Person p = (Person) super.clone();
        return p;
    }
}
