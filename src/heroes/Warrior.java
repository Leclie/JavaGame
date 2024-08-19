package heroes;

import enemies.Enemy;
import utilities.Dice;

public class Warrior extends Hero {

    private int shieldHealth = 5;
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Heroes.Warrior " + getName() + " attack the enemy");
        enemy.takeDamage(Dice.rollInt());
    }

    @Override
    public void takeDamage(int damage) {
        if (shieldHealth > 0 && Dice.rollBoolean()){
            shieldHealth--;
            System.out.println("Damage blocked");
            return;
        }

        health -= damage;
        System.out.println("Heroes.Warrior " + getName() + " get " + damage + " damage");
    }
}
