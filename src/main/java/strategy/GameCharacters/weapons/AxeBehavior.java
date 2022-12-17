package strategy.GameCharacters.weapons;

import strategy.GameCharacters.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("chopping with an axe");
    }
}
