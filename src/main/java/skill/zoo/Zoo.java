package skill.zoo;

public class Zoo {
    Object[] objects;

    public Zoo() {
        objects = new Object[3];
        objects[0] = new Dog(5, "Cat");
        objects[1] = new Cat();
        objects[2] = new Reptile(10, "Tortuga");
    }

    public void print() {
        for (Object o : objects) {
            System.out.println(o);
        }
    }

    public void sound() {
        for (Object o : objects) {
            if (o instanceof Soundable)
                ((Soundable) o).sound();
        }
    }

    public void change(Object o, int i) {
        if (i >= 0 && i < objects.length)
            objects[i] = o;
    }

}