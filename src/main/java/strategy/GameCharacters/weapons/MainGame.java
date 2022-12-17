package strategy.GameCharacters.weapons;

import strategy.GameCharacters.WeaponBehavior;
import strategy.GameCharacters.characters.Character;
import strategy.GameCharacters.characters.Queen;
import strategy.GameCharacters.weapons.SwordBehavior;

public class MainGame {
    public static void main(String[] args) {
        WeaponBehavior sword = new SwordBehavior();
        Character queen = new Queen(sword);
        queen.fight();
    }
}
