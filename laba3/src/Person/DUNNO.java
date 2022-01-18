package Person;

import Exceptions.CountException;
import Food.PackOfFood;
import Helpers.Action;
import Helpers.MathOperation;
import Person.Stranger;
import Time.CustomTimePeriod;
import Time.Month;
import Time.TimePeriod;
import Time.Year;

public class DUNNO extends Stranger {

    public DUNNO(String name) {
        super(name);
    }

    public void rememberAbout(Stranger stranger) {
        System.out.println(name + " вспомнил о " + stranger.name);
    }

    public void remember(PackOfFood pack) {
        System.out.println(name + " вспомнил, что " + pack.getName() + " хватит на " + pack.countCapacity() +
                " дней для " + pack.countTravellers() + " путешественников");
    }

    public void startSleep(){
        class Eyes {
            public void closeEyes() {
                System.out.println("Глаза закрылись");
            }
        };

        Eyes eyes = new Eyes();
        eyes.closeEyes();
        Sleep.startSleep("Незнайка");
    }

    public void calculate(int a, int b, MathOperation operation) throws CountException {

        System.out.println("Незнайка выполнил операцию");

        Action action;

        switch (operation) {
            case DIVISION:
                action = new Action() {
                    @Override
                    public int action(int x, int y) {
                        System.out.println(x + " делить на " + y + " = " + x / y);
                        try {
                            return x / y;
                        } catch (ArithmeticException ignore){
                            System.out.println("Деление на ноль запрещено! ");
                            return Integer.MAX_VALUE;
                        }
                    }
                };
                action.action(a, b);
                break;

            case MULTIPLY:
                action = new Action() {
                    @Override
                    public int action(int x, int y) {
                        System.out.println(x + " умножить на " + y + " = " + x * y);
                        return x * y;
                    }
                };
                action.action(a, b);
                break;

            case MODULOREMINDER:
                action = new Action() {
                    @Override
                    public int action(int x, int y) {
                        System.out.println("Остаток от деления " + x + " на " + y + " = " + x % y);
                        return x % y;
                    }
                };
                action.action(a, b);
                break;
            default:
                break;
        }
    }

    public void understand(PackOfFood pack) {
        System.out.println(name + " узнал, что " + pack.getName() + " хватит на " + pack.countFullCapacity() +
                " дней для 1 путешественника");
    }

    public void countTime(CustomTimePeriod time) {
        System.out.println(name + " посчитал, что в " + time.getDuration() + " днях - " + time.getYears() + " лет, " +
                time.getMonths() + " месяцев, " + time.getDays() + " дней");
    }

    private void knowPeriod(String period) {
        switch (period) {
            case "год":
                System.out.println(name + " знает что в " + period + " " + Year.lasting + " дней.");
                break;
            case "месяц":
                System.out.println(name + " знает что в " + period + " " + Month.lasting + " дней.");
                break;
        }
    }

    public void knowTime() {
        knowPeriod("год");
        knowPeriod("месяц");
    }

    public void beHappy() {
        System.out.println(name + " начал радоваться");
    }
}