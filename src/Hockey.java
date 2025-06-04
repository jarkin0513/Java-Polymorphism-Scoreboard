import java.util.List;

/**
 * The Hockey class represents a game of hockey.
 * This class extends the abstract Sport class and provides implementations for its abstract methods.
 */
public class Hockey extends Sport{

    /**
     * Constructor for the Hockey class.
     * Sets the period length and name. Also defines the different scoring methods to be used and sets the teams.
     *
     * @param homeTeam The home team.
     * @param awayTeam The away team.
     */
    public Hockey(Team homeTeam, Team awayTeam) {
        // Set period length and name
        periodLength = 3;
        periodName = "Period";

        // Define the scoring methods for football
        scoringMethods = List.of(
                new ScoringMethod("Even-Strength Goal"),
                new ScoringMethod("Power-Play Goal"),
                new ScoringMethod("Short-Handed Goal"),
                new ScoringMethod("Empty-Net Goal"),
                new ScoringMethod("Penalty-Shot Goal")
        );

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
            case "Even-Strength Goal", "Power-Play Goal", "Short-Handed Goal", "Empty-Net Goal", "Penalty-Shot Goal":
                return 1;
            default:
                return 0;

        }
    }
}
