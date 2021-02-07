public class Rogue extends Character {

    int attackPower;
    int backStabModifier;
    int defense;
    int dodge;

    public Rogue(String name, double height, String eyes, int HP, State state, int attackPower, int backStabModifier, int defense, int dodge) {
        super(name, height, eyes, HP, state);
        this.attackPower = attackPower;
        this.backStabModifier = backStabModifier;
        this.defense = defense;
        this.dodge = dodge;
    }

    @Override
    int calculateDamage() {
        return attackPower + backStabModifier + DiceRoller.rollTheDice(2, 6);
    }

    @Override
    int getDefense() {
        return defense + dodge + DiceRoller.rollTheDice(1, 6);
    }
}
