package sam.fightergame.characters;

/**
 * Abstract class representing a character object
 * for a fighter game in its purest form.
 * @author Sam Bowman
 */
public abstract class Character {

    private String name;
    private int hp;
    private int maxHp;
    protected Type type;
    protected int basicAttack;
    protected int specialAttack;

    protected Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    /**
     * Returns the character's type
     * @return the character's type
     */
    public Type getType() { return type; }

    public String getName() {
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
     */
    public abstract void basicAttack();

    /**
     * Exercise the character's special attack
     */
    public abstract void specialAttack();

    /**
     * Deal damage to another character
     * @param character the character to deal damage to
     */
    public abstract void dealDamage(Character character);

    /**
     * Take damage after an attack
     * @param damage the amount of damage to take
     */
    public abstract void takeDamage(int damage);

    /**
     * Determine a character's strength in relation to its opponent's
     * type; certain matchups are more advantageous than others.
     * @param character the other character
     * @return the appropriate member of {@link sam.fightergame.characters.Matchup}
     */
    public abstract Matchup compareTo(Character character);

}
