package finished.archive.lesson46;

public class ValidatorImpl implements Validator {
    @Override
    public boolean validate(int value) {
        return value >= 60;
    }
}
