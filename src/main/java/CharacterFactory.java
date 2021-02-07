public final class CharacterFactory {

    public final Character makeCharacter (CharacterName characterClass) {
        switch (characterClass) {
            case WIZARD:
                return new Wizard("Kuśka", 1.90, "blue", 150, State.ALIVE, 150, 10, 150);
            case WARRIOR:
                return new Warrior("Don Chichot", 1.60, "green", 150, State.ALIVE, 150, 15, 150, 20);
            case ROGUE:
                return new Rogue("Kirk Javorsky", 1.65, "grey", 150, State.ALIVE, 150, 15, 150, 10);
            case BOSS:
                return new Boss ("Jabajbaj", 2.3, "dark", 1000, State.ALIVE, 500, 50, 15);
            default:
                return null;
        }
    }
}
