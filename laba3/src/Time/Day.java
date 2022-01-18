package Time;

public class Day extends TimePeriod implements LastingInterface {
    public static int lasting = 1;
    public Day(String name) {
        super(1, name);
    }

    static int FindOutAmount(int x) {
        return (x / lasting);
    }

    static int ReturnRemainderOfDaysAfter(int x) {
        return (x % lasting);
    }
}
