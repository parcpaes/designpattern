package StartBuzz.decorators;

import StartBuzz.Beverage;
import StartBuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Mocha";
    }
}
