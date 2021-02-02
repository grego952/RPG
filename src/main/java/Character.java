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

    String showCharacterSheet() {
        return "Name " + name +
                " Height " + height +
                " Eyes color " + eyes +
                " HP " + HP;
    };

    State attack(Character enemy) {
        int strikeResult = calculateDamage() - enemy.getDefense();
        HP -= strikeResult;
        if (isCharacterAlive(enemy)) {
            System.out.println(getName() + " hit " + enemy.name + " dealing " + strikeResult + "  damage");
            return State.ALIVE;
        } else {
            System.out.println(getName() + " killed " + enemy.name);
            return State.DEAD;
        }
    }

    boolean isCharacterAlive(Character enemy) {
        if (enemy.getHP() < 1) {
            attack(enemy);
            return true;
        } else
            return false;
    }
}
