package chap02;


import java.time.DayOfWeek;
import java.time.LocalTime;


public class PeriodCondition implements DiscountCondition{
    private final DayOfWeek dayOfWeek;
    private final LocalTime startTime;
    private final LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                !startTime.isAfter(screening.getStartTime().toLocalTime()) &&
                !endTime.isBefore(screening.getStartTime().toLocalTime());
    }
}
