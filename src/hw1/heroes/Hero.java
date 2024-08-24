package hw1.heroes;

import hw1.characteristics.Mortal;
import hw1.enemies.Enemy;

public abstract class Hero implements Mortal {

    private String name;
    protected int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage){
        System.out.println("Hero " + name + " take " + damage + " damage");
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackEnemy(Enemy enemy);

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
