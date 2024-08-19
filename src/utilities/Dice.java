package utilities;

import java.util.Random;

public class Dice {

    private static Random random = new Random();

    public static int rollInt() {
        return random.nextInt(21);
    }

    public static boolean rollBoolean() {
        return random.nextBoolean();
    }
}
