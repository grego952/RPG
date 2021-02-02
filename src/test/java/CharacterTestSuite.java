import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTestSuite {


    @Test
    void testCharacterFactory() {

        //Given
        CharacterFactory factory = new CharacterFactory();

        //When
       Character wizard = factory.makeCharacter(CharacterFactory.WIZARD);

        //When
        assertEquals ("Kuśka", wizard.getName());
    }

    @Test
    void testAttack() {

        //Given
        CharacterFactory factory = new CharacterFactory();
        Character wizard = factory.makeCharacter(CharacterFactory.WIZARD);
        Character warrior = factory.makeCharacter(CharacterFactory.WARRIOR);
        Character rogue = factory.makeCharacter(CharacterFactory.ROGUE);
        Character boss = factory.makeCharacter(CharacterFactory.BOSS);

        //When
        wizard.attack(boss);
        warrior.attack(rogue);
        rogue.attack(wizard);
        boss.attack(warrior);

        //Then
        //do nothing
    }

}
