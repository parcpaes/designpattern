package strategy.GameCharacters.characters;

import strategy.GameCharacters.WeaponBehavior;

public class Queen extends Character {
    public Queen(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.println("Queen.. ");
        weapon.useWeapon();
    }
}
