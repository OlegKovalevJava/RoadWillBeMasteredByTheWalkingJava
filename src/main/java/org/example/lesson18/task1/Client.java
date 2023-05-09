package org.example.lesson18.task1;

class Client extends Person {
    private int sum;
    private String bank;

    public Client(String name, String bank, int sum) {
        super(name);
        this.bank = bank;
        this.sum = sum;
    }

    public void display() {
        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }

    public String getBank() {
        return bank;
    }

    public int getSum() {
        return sum;
    }
}