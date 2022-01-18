package Time;

abstract public class TimePeriod {
    protected String name;
    protected int duration;     ///в днях

    public TimePeriod(int duration, String name) {
        this.duration = duration;
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

}