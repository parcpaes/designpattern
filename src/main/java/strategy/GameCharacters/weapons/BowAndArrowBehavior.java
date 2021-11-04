package strategy.GameCharacters.weapons;

import strategy.GameCharacters.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("pointing an arrow with a bow");
    }
}
