package enemies;

import characteristics.Mortal;
import heroes.Hero;

public abstract class Enemy implements Mortal {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void takeDamage(int damage);

    public void attackHero(Hero hero){
        hero.takeDamage(20);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
