package sam.fightergame.characters;

/**
 * Concrete implementation of a character
 * of type Bird
 * @author Sam Bowman
 */
public class BirdType extends Character {

    public BirdType(String name, int hp) {
        super(name,hp);
        super.type = Type.BIRD;
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
                " is a bird-type fighter " +
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
     * Bird types perform very well against ground and water
     * types and poorly against fire types.
     */
    @Override
    public Matchup compareTo(Character character) {
        switch(character.getType()) {
            case FIRE:
                return Matchup.WEAK;
            case WATER:
                return Matchup.STRONG;
            case BIRD:
                return Matchup.NEUTRAL;
            case GROUND:
                return Matchup.DOMINANT;
        }
        return null;
    }
}
