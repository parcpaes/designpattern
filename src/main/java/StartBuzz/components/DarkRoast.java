package StartBuzz.components;

import StartBuzz.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        this.description = "Dark Roast Coffee ";
    }

    @Override
    public String getDescription() {
        return getSize().name()+" "+this.description;
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
