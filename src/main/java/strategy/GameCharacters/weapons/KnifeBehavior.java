package strategy.GameCharacters.weapons;

import strategy.GameCharacters.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Cutting with a knife");
    }
}
