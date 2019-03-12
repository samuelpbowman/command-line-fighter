package sam.fightergame.fighters;

/**
 * Concrete implementation of a character
 * of type Bird
 * @author Sam Bowman
 */
@SuppressWarnings("unused")
public class BirdType extends Fighter {

    public BirdType(String name, int hp) {
        super(name,hp);
        super.type = Type.BIRD;
        super.basicDamage = 50;
        super.specialDamage = 70;
    }

    public BirdType(String name) {
        super(name,1000);
        super.type = Type.BIRD;
        super.basicDamage = 50;
        super.specialDamage = 70;
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
     * Bird types perform very well against ground and water
     * types and poorly against fire types.
     */
    @Override
    public Matchup compareTo(Fighter fighter) {
        switch(fighter.getType()) {
            case FIRE:
                return Matchup.WEAK;
            case WATER:
                return Matchup.STRONG;
            case GROUND:
                return Matchup.DOMINANT;
            case BIRD:
            default:
                return Matchup.NEUTRAL;
        }
    }
}
