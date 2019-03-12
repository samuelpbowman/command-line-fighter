package sam.fightergame.characters;

/**
 * Concrete implementation of a character
 * of type Fire
 * @author Sam Bowman
 */
public class FireType extends Character {

    public FireType(String name, int hp) {
        super(name,hp);
        super.type = Type.FIRE;
        super.basicAttack = 50;
        super.specialAttack = 70;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void basicAttack() {
        //TODO
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void specialAttack() {
        //TODO
    }

    @Override
    public String toString() {
        return super.getName() +
                " is a fire-type fighter " +
                "with HP " + super.getHp() +
                "/" + super.getMaxHp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dealDamage(Character character) {
        //TODO
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void takeDamage(int damage) {

    }

    /**
     * {@inheritDoc}
     * Fire performs well against bird and ground types
     * but poorly against water
     */
    @Override
    public Matchup compareTo(Character character) {
        switch(character.getType()) {
            case FIRE:
                return Matchup.NEUTRAL;
            case WATER:
                return Matchup.WEAK;
            case BIRD:
                return Matchup.DOMINANT;
            case GROUND:
                return Matchup.STRONG;
        }
        return null;
    }
}
