package golddrone.object.ch01.ch02;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy){
        this.discountPolicy = discountPolicy;
    }

    public Money getFee(){
        return fee;
    }

    public Money calculateMovieFee(Screening screening){

        // 책임의 위치를 결정하기 위해 조건문을 사용하는 것은 좋지 않은 선택
//        if(discountPolicy == null){
//            return fee;
//        }


        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
