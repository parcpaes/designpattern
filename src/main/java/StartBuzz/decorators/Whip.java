package StartBuzz.decorators;

import StartBuzz.Beverage;
import StartBuzz.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
}
