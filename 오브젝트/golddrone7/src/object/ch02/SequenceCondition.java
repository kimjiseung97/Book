package golddrone.object.ch01.ch02;

public class SequenceCondition implements DiscountCondition{
    private int sequence;

    public SequenceCondition(int sequuence) {
        this.sequence = sequuence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
