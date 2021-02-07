import java.util.Random;

public class DiceRoller {

    public static int rollTheDice (int numberOfDices, int diceType) {
        Random random = new Random();


        int result = 0;

        for (int i = 0; i < numberOfDices; i++) {
            result = random.nextInt(diceType) + 1;
        }

        return result;
    }
}
