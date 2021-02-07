public class Main {
    public static void main(String[] args) {
        Party party = new Party();

        CharacterFactory factory = new CharacterFactory();
        Character wizard = factory.makeCharacter(CharacterName.WIZARD);
        Character warrior = factory.makeCharacter(CharacterName.WARRIOR);
        Character rogue = factory.makeCharacter(CharacterName.ROGUE);
        Character boss = factory.makeCharacter(CharacterName.BOSS);

         party.addToParty(wizard);
         party.addToParty(warrior);
         party.addToParty(rogue);

         Battle battle = new Battle();
         battle.simulate(party, boss);

        }
    }
