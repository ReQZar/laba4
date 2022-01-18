package Time;

import Exceptions.TimeUnderZero;

public class CustomTimePeriod extends TimePeriod implements CustomTimePeriodInterface {
    private int years;
    private int months;
    private int days;

    public CustomTimePeriod(int duration, String name) throws TimeUnderZero {
        super(duration, name);
        findAllPeriods();
    }
    public void findAllPeriods() throws TimeUnderZero {
        int x = this.duration;
        if (x < 0)
            throw new TimeUnderZero();
        years = Year.FindOutAmount(x);
        x = Year.ReturnRemainderOfDaysAfter(x);
        months = Month.FindOutAmount(x);
        x = Month.ReturnRemainderOfDaysAfter(x);
        days = Day.FindOutAmount(x);

    }

    public int getYears() {
        return years;
    }

    public int getMonths() {
        return months;
    }

    public int getDays() {
        return days;
    }

}