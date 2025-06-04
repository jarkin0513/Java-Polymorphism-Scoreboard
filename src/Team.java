/**
 * The Team class represents a team in a sport.
 */
public class Team {

    private String teamName;    // The team name

    /**
     * Constructor for Team class.
     * Initializes name of the team.
     * @param teamName  The team name.
     */
    public Team(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Returns the team name.
     * @return The name of the team.
     */
    public String getTeamName() {
        return teamName;
    }
}
