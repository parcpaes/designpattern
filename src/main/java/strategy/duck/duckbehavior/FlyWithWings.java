package strategy.duck.duckbehavior;

import strategy.duck.duckbehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
