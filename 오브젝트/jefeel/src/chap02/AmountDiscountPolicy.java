package chap02;


public class AmountDiscountPolicy extends DiscountPolicy {

    private final Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return discountAmount;
    }
}
