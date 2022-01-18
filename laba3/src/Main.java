import Exceptions.CountException;
import Exceptions.TimeUnderZero;
import Food.Food;
import Food.PackOfFood;
import Helpers.MathOperation;
import Person.DONUT;
import Person.DUNNO;
import Person.Stranger;
import Person.Traveller;
import Time.CustomTimePeriod;

public class Main {
    public static void main(String[] args) throws TimeUnderZero {
        DUNNO neznaika = new DUNNO("Незнайка");

        Traveller[] travellers = new Traveller[48];

        for (int i = 0; i < 48; i++) {
            travellers[i] = new Traveller();
        }

        Food[] foods = new Food[480];

        for (int i = 0; i < 480; i++) {
            foods[i] = new Food(1);
        }

        CustomTimePeriod time = new CustomTimePeriod(10, "десять дней");

        PackOfFood food = new PackOfFood(foods, time, travellers);

        DONUT donut = new DONUT("Пончик", food);

        neznaika.rememberAbout(donut);

        neznaika.remember(food);

        try {
            neznaika.calculate(48, 10, MathOperation.MULTIPLY);
        } catch (CountException e) {
            e.printStackTrace();
        }

        food.countFullCapacity();

        neznaika.understand(food);

        CustomTimePeriod secondTime = new CustomTimePeriod(480, "четыреста восемьдесять дней");

        neznaika.knowTime();

        neznaika.countTime(secondTime);

        donut.willDie();

        neznaika.beHappy();

        neznaika.startSleep();

    }
}

