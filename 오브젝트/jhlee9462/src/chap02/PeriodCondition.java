package chap02;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.ZoneId;

public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().atZone(ZoneId.systemDefault()).getDayOfWeek().equals(dayOfWeek) &&
                !startTime.isAfter(screening.getStartTime().atZone(ZoneId.systemDefault()).toLocalTime()) &&
                !endTime.isBefore(screening.getStartTime().atZone(ZoneId.systemDefault()).toLocalTime());
    }
}
