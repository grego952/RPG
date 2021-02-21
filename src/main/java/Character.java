public abstract class Character {

    String name;
    double height;
    String eyes;
    int HP;
    State state;

    public Character(String name, double height, String eyes, int HP, State state) {
        this.name = name;
        this.height = height;
        this.eyes = eyes;
        this.HP = HP;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getEyes() {
        return eyes;
    }

    public int getHP() {
        return HP;
    }

    public State getState() {
        return state;
    }

    abstract int calculateDamage();

    abstract int getDefense();

    public String showCharacterSheet() {
        return "Name " + name +
                " Height " + height +
                " Eyes color " + eyes;
    }

    ;

    @Override
    public String toString() {
        return "Character "
                + name;
    }

    void attack(Character enemy) {
        int strikeResult = calculateDamage() - enemy.getDefense();
        if (strikeResult <= 0) {
            strikeResult = 0;
            System.out.println(getName() + " missed " + enemy.getName());
            return;
        }
        enemy.HP -= strikeResult;

        if (enemy.getHP() > 0) {
            System.out.println(getName() + " hit " + enemy.name + " dealing " + strikeResult + " damage");
        } if (enemy.getHP() <= 0) {
            System.out.println(getName() + " killed " + enemy.name + " dealing " + strikeResult + " damage");
        }
    }

    boolean isCharacterAlive() {
        return HP > 0;
    }

    void bossAttack(Party party) {

        for (int i = 0; i < party.getAll().size(); i++) {
            if (party.getAll().get(i).isCharacterAlive()) {
                attack(party.getAll().get(i));
            }
        }

    }
}
