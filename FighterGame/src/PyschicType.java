

/**
 * Concrete implementation of a character
 * of type Psychic
 * @author Bryan Smith
 *
 */
@SuppressWarnings("unused")

public class PyschicType extends Fighter {


	public PyschicType(String name, int hp) {
		super(name, hp);
		super.type = Type.PSYCHIC;
		super.basicDamage = 30;
		super.specialDamage = 80;
		
	}

	
	public PyschicType(String name) {
		super(name, 1000);
		super.type = Type.PSYCHIC;
		super.basicDamage = 5;
		super.specialDamage = 100;
	}
	
	/** returns a string representation of this psychic type
	 * @return a string representation of this psychic type
	 */
	public String toString() {
		return super.getName() + 
				"is a psychic type fighter " +
				"with HP " + super.getHp() +
				"/" + super.getMaxHp();
	}
	
	
				
	/**
	 * {@inheritDoc}
	 * The Psychic type peforms robustly against Bird types,
	 * well against Water types, but poorly against ground types.
	 */
	public Matchup compareTo(Fighter fighter) {
		switch(fighter.getType()) {
		case FIRE:
			return Matchup.NEUTRAL;
		case BIRD:
			return Matchup.DOMINANT;
		case GROUND:
			return Matchup.WEAK;
		case PSYCHIC:
			default:
				return Matchup.NEUTRAL;
		}
	}
}
