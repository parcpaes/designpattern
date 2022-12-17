package strategy.duck;

import strategy.duck.duckbehavior.FlyWithWings;
import strategy.duck.duckbehavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("Im a real Mallard Duck");
    }
}
