package strategy.GameCharacters.characters;

import strategy.GameCharacters.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();

    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
