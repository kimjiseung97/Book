package golddrone.object.ch01.ch02;

public class PercentDiscountPolicy implements DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super();
        this.percent = percent;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return null;
    }

    @Override
    public Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
