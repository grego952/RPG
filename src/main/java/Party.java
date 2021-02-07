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

    State teamAttack(Character enemy) {

        for (Character character : teamMembers) {
            if (character.getHP() > 0) {
                character.attack(enemy);
            } else {
                System.out.println(character + " is dead");
                return State.DEAD;
            }
        }
        return State.ALIVE;
    }

    boolean isPartyAlive() {
        for (Character partyMember : getAll()) {
            if (partyMember.isCharacterAlive()) {
                return true;
            } else {
                System.out.println("There is no one left...");
                return false;
            }
        }
        return true;
    }
}
