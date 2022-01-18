package Time;

public class Year extends TimePeriod implements LastingInterface {
    public static int lasting = 360;
    public Year(String name) {
        super(360, name);
    }

    static int FindOutAmount(int x) {
        return (x / lasting);
    }

    static int ReturnRemainderOfDaysAfter(int x) {
        return (x % lasting);
    }

}
