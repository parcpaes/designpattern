package strategy.GameCharacters.characters;

import strategy.GameCharacters.WeaponBehavior;

public class Knight extends Character {
    public Knight(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.println("Knight ...");
        weapon.useWeapon();
    }
}
