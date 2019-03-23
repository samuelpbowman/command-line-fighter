package bowsmith.fightergame.fighters;

/**
 * Concrete implementation of a character
 * of type Ground
 * @author Sam Bowman
 */
@SuppressWarnings("unused")
public class GroundType extends Fighter {

	public GroundType(String name, int hp) {
		super(name,hp);
		super.type = Type.FIRE;
		super.basicDamage = 50;
		super.specialDamage = 90;
	}

	public GroundType(String name) {
		super(name,1000);
		super.type = Type.GROUND;
		super.basicDamage = 50;
		super.specialDamage = 90;
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
	 * Ground types counter fire types very effectively,
	 * handle bird types well enough, and are rather
	 * ineffective against water types
	 */
	@Override
	public Matchup compareTo(Fighter fighter) {
		switch(fighter.getType()) {
			case BIRD:
				return Matchup.STRONG;
			case FIRE:
				return Matchup.DOMINANT;
			case WATER:
				return Matchup.WEAK;
			default:
				return Matchup.NEUTRAL;
		}
	}
}
