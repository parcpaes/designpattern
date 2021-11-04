package strategy.GameCharacters.characters;

import strategy.GameCharacters.WeaponBehavior;

public class King extends Character {
    public King(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.println("King fight with");
        weapon.useWeapon();
    }
}
