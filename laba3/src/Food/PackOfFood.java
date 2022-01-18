package Food;

import Person.Traveller;
import Time.CustomTimePeriod;

public class PackOfFood implements CapacityInterface {
    final private Food[] pack;

    String name = "пакет еды";

    final private CustomTimePeriod time;

    final private Traveller[] guys ;

    public PackOfFood(Food[] foods, CustomTimePeriod time, Traveller[] guys) {
        this.pack = foods;
        this.time = time;
        this.guys = guys;
    }

    public int countFullCapacity() {
        int sum = 0;
        for (Food food : pack) {
            sum += food.getCapacity();
        }
        return sum;
    }

    public int countCapacity() {
        int fullCapacity = countFullCapacity();
        return fullCapacity / guys.length;
    }

    public int countTravellers() {
        return guys.length;
    }

    public String getName() {
        return name;
    }


}