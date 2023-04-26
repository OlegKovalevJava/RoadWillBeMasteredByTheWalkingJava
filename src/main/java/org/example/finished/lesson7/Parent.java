package org.example.finished.lesson7;

class Parent {
    int method() {
        return 777;
    }
}

class Child extends Parent {
    @Override
    int method() {
        return 999;
    }

    static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    static int factorialTwo(int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }
}

class Example {
    public static void main(String[] args) {
        System.out.println(Child.factorial(5));
        System.out.println(Child.factorialTwo(5));
    }
}