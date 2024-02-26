package finished.archive.lesson16.example1;

public class Client extends Person{
    private String bank;

    public Client(String name, String bank) {
        super(name);
        this.bank = bank;
    }

    @Override
    public void display() {
        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }

}
