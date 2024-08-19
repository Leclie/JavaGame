import enemies.Enemy;
import enemies.Spider;
import heroes.Archer;
import heroes.Hero;
import heroes.Mage;
import heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Aragorn", 200);
        Mage mage = new Mage("Gendalf", 100);
        Archer archer = new Archer("Legolaz", 100);

        Enemy spider1 = new Spider(40);
        Enemy spider2 = new Spider(35);
        Enemy spider3 = new Spider(60);

        warrior.attackEnemy(spider1);
        spider1.attackHero(warrior);

        mage.stunEnemy(spider2);
        spider2.attackHero(mage);

        archer.attackEnemy(spider3);
        spider3.attackHero(archer);

        System.out.println("warrior is alive: " + warrior.isAlive() + " health: " + warrior.getHealth());
        System.out.println("mage is alive: " + mage.isAlive() + " health: " + mage.getHealth());
        System.out.println("archer is alive: " + archer.isAlive() + " health: " + archer.getHealth());

        System.out.println("spider1 is alive: " + spider1.isAlive() + " health: " + spider1.getHealth());
        System.out.println("spider2 is alive: " + spider2.isAlive() + " health: " + spider2.getHealth());
        System.out.println("spider3 is alive: " + spider3.isAlive() + " health: " + spider3.getHealth());
    }
}
