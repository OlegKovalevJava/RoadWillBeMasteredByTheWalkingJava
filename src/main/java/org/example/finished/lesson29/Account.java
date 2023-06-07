package org.example.finished.lesson29;

import java.math.BigDecimal;

public class Account <T>implements Accountable<T> {
    private T id;
    private BigDecimal sum;

    public Account(T id, BigDecimal sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public T getId() {
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