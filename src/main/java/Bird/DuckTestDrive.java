package Bird;

import Bird.Turkeys.Turkey;
import Bird.Turkeys.WildTurkey;
import Bird.ducks.*;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says..");
        testDuck(turkeyAdapter);

        Drone drone = new SuperDrone();
        DroneAdapter droneAdapter = new DroneAdapter(drone);
        System.out.println("\nThe DroneAdapter says..");
        testDuck(droneAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
