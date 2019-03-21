

/**
 * Concrete implementation of a character
 * of type Fire
 * @author Sam Bowman
 */
@SuppressWarnings("unused")
public class FireType extends Fighter {

    public FireType(String name, int hp) {
        super(name,hp);
        super.type = Type.FIRE;
        super.basicDamage = 50;
        super.specialDamage = 70;
    }

    public FireType(String name) {
        super(name,1000);
        super.type = Type.FIRE;
        super.basicDamage = 50;
        super.specialDamage = 70;
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
     * Fire performs well against bird and ground types
     * but poorly against water
     */
    @Override
    public Matchup compareTo(Fighter fighter) {
        switch(fighter.getType()) {
            case WATER:
                return Matchup.WEAK;
            case BIRD:
                return Matchup.DOMINANT;
            case GROUND:
                return Matchup.STRONG;
            case FIRE:
            default:
                return Matchup.NEUTRAL;
        }
    }
}
