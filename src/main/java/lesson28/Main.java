package lesson28;

public class Main {
    public static void main(String[] args) {
        Generic1<Integer> integerGeneric1 = new Generic1<>();
        integerGeneric1.setField(1);
        System.out.println(integerGeneric1.getField());

        Generic1<String> stringGeneric1 = new Generic1<>();
        stringGeneric1.setField("ОДИН");
        System.out.println(stringGeneric1.getField());


    }
}