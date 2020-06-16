package step2;

import java.util.Objects;

public class Money {

    private final int money;

    public static Money buy(int money){
        return new Money(money);
    }

    private Money(int money) {
        check(money);
        this.money = money;
    }

    private void check(int money) {
        checkZero(money);
        checkNegative(money);
    }

    private void checkNegative(int money) {
        if(money < 0) {
            throw new IllegalArgumentException(Error.NOT_NEGATIVE_MESSAGE);
        }
    }

    private void checkZero(int money) {
        if(money == 0) {
            throw new IllegalArgumentException(Error.NOT_ZERO_MESSAGE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money1 = (Money) o;
        return money == money1.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }

    public int divide(int lottoPrice) {
        return money / lottoPrice;
    }
}
