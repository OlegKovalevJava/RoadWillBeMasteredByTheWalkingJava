package org.example.finished.lesson28;

public class Main {
    public static void main(String[] args) {
        Generic1<Byte> byteGeneric1 = new Generic1<>();
        byteGeneric1.setField((byte) 1);
        System.out.println(byteGeneric1.getField());

        Generic1<Short> shortGeneric1 = new Generic1<>();
        shortGeneric1.setField((short) 10);
        System.out.println(shortGeneric1.getField());

        Generic1<Integer> integerGeneric1 = new Generic1<>();
        integerGeneric1.setField(100);
        System.out.println(integerGeneric1.getField());

        Generic1<Long> longGeneric1 = new Generic1<>();
        longGeneric1.setField(1000L);
        System.out.println(longGeneric1.getField());

        Generic1<String> stringGeneric1 = new Generic1<>();
        stringGeneric1.setField("ОДИН");
        System.out.println(stringGeneric1.getField());

        Byte number = 100;
        System.out.println(number);

    }
}