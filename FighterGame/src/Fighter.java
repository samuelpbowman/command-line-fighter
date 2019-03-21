

/**
 * Abstract class representing a character object
 * for a fighter game in its purest form.
 * @author Sam Bowman
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public abstract class Fighter {

    private String name;
    private int hp;
    private int maxHp;
    Type type;
    int basicDamage;
    int specialDamage;

    Fighter(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    /**
     * Returns the character's type
     * @return the character's type
     */
    public Type getType() { return type; }

    String getName() {
        return name;
    }

    /**
     * Sets the character's name
     * @param name the intended name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the character's current hit points
     * @return the current hit points
     */
    public int getHp() {
        return hp;
    }

    /**
     * Returns some of the user's hit points
     * @param points the number of points to restore
     */
    public void heal(int points) {
        if(this.hp + points > this.maxHp)
            this.hp = this.maxHp;
        else
            this.hp += points;
    }

    /**
     * Returns the maximum hit points for this character
     * @return the maximum hit points
     */
    public int getMaxHp() {
        return maxHp;
    }

    /**
     * Allows the max hit points to be reset
     * @param maxHp the intended max hit points
     */
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    /**
     * Exercise the character's basic attack
     * @param fighter the fighter to attack
     */
    public void basicAttack(Fighter fighter) {
        fighter.takeDamage(this.basicDamage);
    }

    /**
     * Exercise the character's special attack
     * @param fighter the character to attack
     */
    public void specialAttack(Fighter fighter) {
        double mult;
        switch(this.compareTo(fighter)) {
            case NEUTRAL:
                mult = 1;
                break;
            case DOMINANT:
                mult = 2;
                break;
            case STRONG:
                mult = 1.5;
                break;
            case WEAK:
                mult = 0.5;
                break;
            default:
                mult = 1;
        }
        int damage = (int)(this.specialDamage * mult);
        fighter.takeDamage(damage);
    }

    /**
     * Take damage after an attack
     * @param damage the amount of damage to take
     */
    public void takeDamage(int damage) {
        if(this.hp - damage <= 0)
            this.hp = 0;
        else
            this.hp -= damage;
    }

    /**
     * Determine a character's strength in relation to its opponent's
     * type; certain matchups are more advantageous than others.
     * @param fighter the other fighter
     * @return the appropriate member of {@link sam.fightergame.fighters.Matchup}
     */
    public abstract Matchup compareTo(Fighter fighter);

}
