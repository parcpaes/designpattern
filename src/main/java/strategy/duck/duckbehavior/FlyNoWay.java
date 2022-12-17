package strategy.duck.duckbehavior;

import strategy.duck.duckbehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
