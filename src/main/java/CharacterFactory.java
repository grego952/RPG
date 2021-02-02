public final class CharacterFactory {

    public static final String WIZARD = "WIZARD";
    public static final String WARRIOR = "WARRIOR";
    public static final String ROGUE = "ROGUE";
    public static final String BOSS = "BOSS";

    public final Character makeCharacter (final String characterClass) {
        switch (characterClass) {
            case WIZARD:
                return new Wizard("Kuśka", 1.90, "blue", 100, State.ALIVE, 100, 10, 150);
            case WARRIOR:
                return new Warrior("Don Chichot", 1.60, "green", 100, State.ALIVE, 100, 15, 100, 20);
            case ROGUE:
                return new Rogue("Kirk Javorsky", 1.65, "grey", 100, State.ALIVE, 100, 15, 100, 10);
            case BOSS:
                return new Boss ("Jabajbaj", 2.3, "dark", 200, State.ALIVE, 200, 50, 200);
            default:
                return null;
        }
    }
}
