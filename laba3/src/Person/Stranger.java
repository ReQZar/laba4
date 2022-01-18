package Person;

public abstract class Stranger {
    protected String name;
    public Stranger(String name){
        this.name = name;
    }

    static class Sleep {
        enum IsSleep {
            SLEEP, NONSLEEP
        }

        static IsSleep isSleep = IsSleep.NONSLEEP;

        static void startSleep(String name){
            System.out.println(name + " начал спать");
            isSleep = IsSleep.SLEEP;
        }

        static void endSleep(String name){
            System.out.println(name + " закончил спать");
            isSleep = IsSleep.NONSLEEP;
        }

    }

    protected Stranger() {
    }

    public void calculate() {

    }
    public void understand() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
