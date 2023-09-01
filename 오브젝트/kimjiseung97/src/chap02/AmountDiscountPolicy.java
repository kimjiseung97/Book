
public class AmountDiscountPolicy extends DiscountPolicy{
    private Money discountAmount;
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return null;
    }
}
