package sam.fightergame.characters;

/**
 * Concrete implementation of a character
 * of type Water
 * @author Sam Bowman
 */
public class WaterType extends Character {

    public WaterType(String name, int hp) {
        super(name,hp);
        super.type = Type.WATER;
        super.basicAttack = 50;
        super.specialAttack = 60;
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

    /**
     * Returns a string representation of this fire type
     * @return a string representation of this fire type
     */
    @Override
    public String toString() {
        return super.getName() +
                " is a water-type fighter " +
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
     * The Water type performs robustly against fire types,
     * well against ground types, but poorly against bird
     * types.
     */
    @Override
    public Matchup compareTo(Character character) {
        switch(character.getType()) {
            case FIRE:
                return Matchup.DOMINANT;
            case WATER:
                return Matchup.NEUTRAL;
            case BIRD:
                return Matchup.WEAK;
            case GROUND:
                return Matchup.STRONG;
        }
        return null;
    }
}
