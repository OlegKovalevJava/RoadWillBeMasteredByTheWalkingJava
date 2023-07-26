package finished.lesson29;

import java.math.BigDecimal;

public interface Accountable<T> {
    T getId();

    BigDecimal getSum();

    void setSum(BigDecimal sum);
}