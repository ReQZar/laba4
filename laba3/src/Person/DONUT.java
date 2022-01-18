package Person;

import Food.PackOfFood;

public class DONUT extends Stranger {
    public DONUT(String name, PackOfFood packOfFood) {
        super(name);
        this.packOfFood = packOfFood;
    }

    private PackOfFood packOfFood;

    public void willDie() {

        if (packOfFood.countFullCapacity() > 360)
            System.out.println(name + " не умрет от голода");
    }

}
