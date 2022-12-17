package strategy.duck.duckbehavior;

import strategy.duck.duckbehavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }
}
