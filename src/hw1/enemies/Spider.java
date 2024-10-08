package hw1.enemies;

import hw1.heroes.Hero;
import hw1.utilities.Dice;

public class Spider extends Enemy{

    private final int armor = 3;
    public Spider(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        int currHealth = getHealth();
        currHealth -= Math.abs(damage - armor);
        setHealth(currHealth);
    }

    public void attackHero(Hero hero){
        hero.takeDamage(Dice.rollInt());
        System.out.println("Spider attack " + hero);
    }
}
