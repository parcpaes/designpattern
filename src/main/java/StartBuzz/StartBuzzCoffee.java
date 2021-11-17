package StartBuzz;

import StartBuzz.components.DarkRoast;
import StartBuzz.components.Espresso;
import StartBuzz.components.HouseBlend;
import StartBuzz.decorators.Mocha;
import StartBuzz.decorators.Soy;
import StartBuzz.decorators.Whip;

public class StartBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());

        Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
    }
}
