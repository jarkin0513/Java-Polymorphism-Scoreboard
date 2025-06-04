import java.util.List;

/**
 * The Soccer class represents a game of soccer.
 * This class extends the abstract Sport class and provides implementations for its abstract methods.
 */
public class Soccer extends Sport {

    /**
     * Constructor for the Soccer class.
     * Sets the period length and name. Also defines the different scoring methods to be used and sets the teams.
     *
     * @param homeTeam The home team.
     * @param awayTeam The away team.
     */
    public Soccer(Team homeTeam, Team awayTeam) {
        // Set period length and name
        periodLength = 2;
        periodName = "Half";

        // Define the scoring methods for football
        scoringMethods = List.of(new ScoringMethod("Goal"));

        // Set the teams for the game
        setTeams(homeTeam, awayTeam);
    }

    /**
     * Determines the score to add based on the scoring method.
     *
     * @param scoringMethodName The name of the scoring method.
     * @return The score to add.
     */
    @Override
    protected int determineScore(String scoringMethodName) {
        switch (scoringMethodName) {
            case "Goal":
                return 1;   // 1 to be added to score
            default:
                return 0;   // Default, no points

        }
    }
}
