import java.util.ArrayList;
import java.util.List;

public class Party {

    List<Character> teamMembers = new ArrayList<>();

    void addToParty(Character character) {
        teamMembers.add(character);
    }

    void expelFromParty(Character character) {
        teamMembers.remove(character);
    }

    public List<Character> getAll() {
        return teamMembers;
    }

    void introduce(Character character) {
        System.out.println(character.showCharacterSheet());
    }

    void teamAttack(Character enemy) {

        for (Character character : teamMembers) {
            if (character.isCharacterAlive() && enemy.isCharacterAlive()) {
                character.attack(enemy);
            }
        }
    }

    boolean isPartyAlive() {
        for (Character partyMember : getAll()) {
            if (partyMember.isCharacterAlive()) {
                return true;
            }
        }
        System.out.println("There is no one left...");
        return false;
    }
}
