package lesson29;

import java.math.BigDecimal;

public class Account implements Accountable<String> {
    private String id;
    private BigDecimal sum;

    public Account(String id, BigDecimal sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public BigDecimal getSum() {
        return sum;
    }

    @Override
    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
}