package skillfactory.array;

public class StringEx {
    public static void main(String[] args) {

        String name = "Ivan";
        Integer age = 77;

        String phrase = "My name is " + name + " I'm is " + age +" age old";
        System.out.println(phrase);

        String formatPhrase = String.format("My name is %s I'm is %d age old", name, age);
        System.out.println(formatPhrase);

    }
}