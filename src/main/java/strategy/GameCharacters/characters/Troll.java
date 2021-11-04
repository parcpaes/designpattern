package strategy.GameCharacters.characters;

import strategy.GameCharacters.WeaponBehavior;

public class Troll extends Character {
    public Troll(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.println("Troll");
        weapon.useWeapon();
    }
}
