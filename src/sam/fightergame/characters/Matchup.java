package sam.fightergame.characters;

/**
 * The levels of advantage or disadvantage
 * a character can have over another
 */
public enum Matchup {
    /** lower than advertised effectiveness */
    WEAK,
    /** normal effectiveness */
    NEUTRAL,
    /** above average effectiveness */
    STRONG,
    /** deals devastating damage */
    DOMINANT
}
