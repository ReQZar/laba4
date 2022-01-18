package Time;

public class Month extends TimePeriod implements LastingInterface {
    public static int lasting = 30;
    public Month(String name) {
        super(30, name);
    }

    static int FindOutAmount(int x) {
        return (x / lasting);
    }

    static int ReturnRemainderOfDaysAfter(int x) {
        return (x % lasting);
    }

    class Operations {

    }
}

