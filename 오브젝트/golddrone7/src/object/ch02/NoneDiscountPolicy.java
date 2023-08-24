package golddrone.object.ch01.ch02;

public class NoneDiscountPolicy implements DiscountPolicy{

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }

    @Override
    public Money getDiscountAmount(Screening screening) {
        return null;
    }
}
