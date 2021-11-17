package StartBuzz.decorators;

import StartBuzz.Beverage;
import StartBuzz.CondimentDecorator;
import StartBuzz.sizes.SoySize;

import java.util.EnumMap;
import java.util.Map;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        SoySize[] values = SoySize.values();
        int size = getSize().ordinal();
        return beverage.cost()+0.15+values[size].price;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
