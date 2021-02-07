import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTestSuite {


    @Test
    void testCharacterFactory() {

        //Given
        CharacterFactory factory = new CharacterFactory();

        //When
       Character wizard = factory.makeCharacter(CharacterName.WIZARD);

        //When
        assertEquals ("Kuśka", wizard.getName());
    }

    @Test
    void testAttack() {

        //Given
        CharacterFactory factory = new CharacterFactory();
        Character wizard = factory.makeCharacter(CharacterName.WIZARD);
        Character warrior = factory.makeCharacter(CharacterName.WARRIOR);
        Character rogue = factory.makeCharacter(CharacterName.ROGUE);
        Character boss = factory.makeCharacter(CharacterName.BOSS);

        //When
        wizard.attack(boss);
        warrior.attack(rogue);
        rogue.attack(wizard);
        boss.attack(warrior);

        //Then
        //do nothing
    }
    @Test
    void testTeamMemberListSize() {
        //Given
        Party party = new Party();
        CharacterFactory factory = new CharacterFactory();
        Character wizard = factory.makeCharacter(CharacterName.WIZARD);
        Character warrior = factory.makeCharacter(CharacterName.WARRIOR);
        Character rogue = factory.makeCharacter(CharacterName.ROGUE);

        //When
        party.addToParty(wizard);
        party.addToParty(warrior);
        party.addToParty(rogue);

        int teamMembersListSize = party.getAll().size();

        //Then
        assertEquals(3, teamMembersListSize);
        assertEquals("Kirk Javorsky", party.teamMembers.get(2).getName());
    }
}
