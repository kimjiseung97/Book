package golddrone.object.ch01.ch02;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);

    Money getDiscountAmount(Screening screening);
}

