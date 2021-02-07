public class Warrior extends Character {

    int attackPower;
    int swordAttackBonus;
    int defense;
    int Aggression;

    public Warrior(String name, double height, String eyes, int HP, State state, int attackPower, int swordAttackBonus, int defense, int aggression) {
        super(name, height, eyes, HP, state);
        this.attackPower = attackPower;
        this.swordAttackBonus = swordAttackBonus;
        this.defense = defense;
        Aggression = aggression;
    }

    @Override
    int calculateDamage() {
        return attackPower + swordAttackBonus + Aggression + DiceRoller.rollTheDice(2, 6);
    }

    @Override
    int getDefense() {
        return defense - Aggression + DiceRoller.rollTheDice(1,6);
    }
}
