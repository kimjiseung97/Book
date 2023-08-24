package golddrone.object.ch01.ch02;

public class AmountDiscountPolicy implements DiscountPolicy {

    private Money discountAmount;


    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super();
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return null;
    }

    @Override
    public Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
