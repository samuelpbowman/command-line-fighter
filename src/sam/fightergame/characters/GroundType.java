package sam.fightergame.characters;

/**
 * Concrete implementation of a character
 * of type Ground
 * @author Sam Bowman
 */
public class GroundType extends Character {

    public GroundType(String name, int hp) {
        super(name,hp);
        super.type = Type.FIRE;
        super.basicAttack = 50;
        super.specialAttack = 90;
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
                " is a ground-type fighter " +
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
     * Ground types counter fire types very effectively,
     * handle bird types well enough, and are rather
     * ineffective against water types
     */
    @Override
    public Matchup compareTo(Character character) {
        switch(character.getType()) {
            case FIRE:
                return Matchup.DOMINANT;
            case WATER:
                return Matchup.WEAK;
            case BIRD:
                return Matchup.STRONG;
            case GROUND:
                return Matchup.NEUTRAL;
        }
        return null;
    }
}
