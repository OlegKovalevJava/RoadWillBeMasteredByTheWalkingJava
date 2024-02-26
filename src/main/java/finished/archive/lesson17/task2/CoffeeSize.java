package finished.archive.lesson17.task2;

public enum CoffeeSize {
    SMALL(100) {
        String getCoffeeClass() {
            return "NOT BAD";
        }
    },
    MEDIUM(200),
    BIG(300);

    final String coffeeClass = "A";
    final int milliliters;

    CoffeeSize(int milliliters) {
        this.milliliters = milliliters;
    }

    int getMilliliters() {
        return milliliters;
    }

    String getCoffeeClass() {
        return coffeeClass;
    }


}

