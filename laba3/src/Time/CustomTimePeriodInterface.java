package Time;

import Exceptions.TimeUnderZero;

public interface CustomTimePeriodInterface {
    void findAllPeriods() throws TimeUnderZero;
    int getYears();
    int getMonths();
    int getDays();
}
