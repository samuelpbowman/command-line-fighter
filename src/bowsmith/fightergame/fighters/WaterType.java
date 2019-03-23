package bowsmith.fightergame.fighters;

/**
 * Concrete implementation of a character
 * of type Water
 * @author Sam Bowman
 */
@SuppressWarnings("unused")
public class WaterType extends Fighter {

    public WaterType(String name, int hp) {
        super(name,hp);
        super.type = Type.WATER;
        super.basicDamage = 50;
        super.specialDamage = 60;
    }

    public WaterType(String name) {
        super(name, 1000);
        super.type = Type.WATER;
        super.basicDamage = 50;
        super.specialDamage = 60;
    }

    /**
     * Returns a string representation of this water type
     * @return a string representation of this water type
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
     * The Water type performs robustly against fire types,
     * well against ground types, but poorly against bird
     * types.
     */
    @Override
    public Matchup compareTo(Fighter fighter) {
        switch(fighter.getType()) {
            case FIRE:
                return Matchup.DOMINANT;
            case BIRD:
                return Matchup.WEAK;
            case GROUND:
                return Matchup.STRONG;
            default:
                return Matchup.NEUTRAL;
        }
    }
}
