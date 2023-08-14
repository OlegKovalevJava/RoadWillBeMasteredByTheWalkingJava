package skill.animal;

public class Animal {

    private boolean vegetarian;
    private String eats;



    public Animal(boolean vegetarian, String eats) {
        this.vegetarian = vegetarian;
        this.eats = eats;
    }

    public void sound() {
        System.out.println("hungry cry");
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

}