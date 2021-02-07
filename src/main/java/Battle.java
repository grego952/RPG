public class Battle {

    void simulate(Party party, Character boss) {

        while (boss.isCharacterAlive() && party.isPartyAlive()) {
            party.teamAttack(boss);
            if(boss.isCharacterAlive()) {
                boss.bossAttack(party);
            }
        }
            for (Character character : party.getAll()) {

                if (character.isCharacterAlive()) {
                    System.out.println(character.getName() + " " + character.HP + " HP");
                }
            }
        }
    }