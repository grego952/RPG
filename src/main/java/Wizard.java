public class Wizard extends Character{

    int magicAttack;
    int wandDamageBonus;
    int barrierStrength;

    public Wizard(String name, double height, String eyes, int HP, State state, int magicAttack, int wandDamageBonus, int barrierStrength) {
        super(name, height, eyes, HP, state);
        this.magicAttack = magicAttack;
        this.wandDamageBonus = wandDamageBonus;
        this.barrierStrength = barrierStrength;
    }

    @Override
    int calculateDamage() {
        return magicAttack + wandDamageBonus + DiceRoller.rollTheDice(2, 6);
    }

    @Override
    int getDefense() {
        return barrierStrength + DiceRoller.rollTheDice(1, 6);
    }

}
