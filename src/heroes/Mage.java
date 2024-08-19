package heroes;

import enemies.Enemy;
import utilities.Dice;

public class Mage extends Hero {

    private int mana = 100;

    private final int manaCostStunEnemy = 30;
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Heroes.Mage " + getName() + " attack the enemy");
        enemy.takeDamage(Dice.rollInt());
    }

    public boolean stunEnemy(Enemy enemy){
        if (mana < manaCostStunEnemy) return false;

        System.out.println("Heroes.Mage " + getName() + " stun the enemy");
        enemy.takeDamage(Dice.rollInt() + 5);
        mana -= manaCostStunEnemy;
        return true;
    }
}
