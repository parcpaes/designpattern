package strategy.GameCharacters.weapons;

import strategy.GameCharacters.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("swinging a sword");
    }
}
