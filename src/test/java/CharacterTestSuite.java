import org.junit.jupiter.api.Test;

public class CharacterTestSuite {

    @Test
    void testAttack() {
        //Given
        Wizard wizard = new Wizard("Kuśka", 1.90, "blue", 100, State.ALIVE, 100, 10, 150);
        Boss boss = new Boss ("Polip", 2.01, "dark", 200, State.ALIVE, 200, 200, 500);

        //When
        wizard.attack(boss);
        boss.attack(wizard);

        //Then
        //do nothing
    }
}
