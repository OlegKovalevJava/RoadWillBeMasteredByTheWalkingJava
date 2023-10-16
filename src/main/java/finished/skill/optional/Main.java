package finished.skill.optional;

import java.util.Optional;

public class Main {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty(); // строка 1
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length); // строка 2
    }
}
