package strategy.duck.duckbehavior;

import strategy.duck.duckbehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
