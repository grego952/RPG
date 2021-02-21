import java.util.Random;

public class Boss extends Character {

    int attack;
    int specialAttack;
    int defense;

    public Boss(String name, double height, String eyes, int HP, State state, int attack, int specialAttack, int defense) {
        super(name, height, eyes, HP, state);
        this.attack = attack;
        this.specialAttack = specialAttack;
        this.defense = defense;
    }

    @Override
    int calculateDamage() {

        Random rand = new Random();

        if (rand.nextInt(10) > 3) {
            System.out.println(name + " used attack");
            return attack + DiceRoller.rollTheDice(2, 6);
        } else
            System.out.println(name + " used specialAttack");
        return specialAttack + DiceRoller.rollTheDice(2, 6);
    }

    @Override
    int getDefense() {
        return defense + DiceRoller.rollTheDice(1, 6);
    }
}
