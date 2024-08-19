package heroes;

import enemies.Enemy;
import utilities.Dice;

public class Archer extends Hero {

    private final int archerBaseDamage = 5;
    private int numberOfArrows = 10;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {

        if (numberOfArrows > 0){
            enemy.takeDamage(Dice.rollInt() + archerBaseDamage);
            System.out.println("Heroes.Archer " + getName() + " attack the enemy");
        } else {
            System.out.println("Not enough arrows!");
        }

    }
}
