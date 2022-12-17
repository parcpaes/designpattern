package strategy.duck;

import strategy.duck.duckbehavior.FlyNoWay;
import strategy.duck.duckbehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Im a model duck");
    }
}
