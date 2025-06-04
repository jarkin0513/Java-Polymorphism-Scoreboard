import java.util.List;

/**
 * The Football class represents a game of football.
 * This class extends the abstract Sport class and provides implementations for its abstract methods.
 */
public class Football extends Sport {

    /**
     * Constructor for the Football class.
     * Sets the period length and name. Also defines the different scoring methods to be used and sets the teams.
     *
     * @param homeTeam The home team.
     * @param awayTeam The away team.
     */
    public Football(Team homeTeam, Team awayTeam) {
        // Set period length and name
        periodLength = 4;
        periodName = "Quarter";

        // Define the scoring methods for football
        scoringMethods = List.of(
                new ScoringMethod("Touchdown"),
                new ScoringMethod("Field Goal"),
                new ScoringMethod("2-Point Conversion"),
                new ScoringMethod("Extra Point"),
                new ScoringMethod("Safety")
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
            case "Touchdown":
                return 6;   // 6 to be added to score
            case "Field Goal":
                return 3;   // 3 to be added to score
            case "Extra Point":
                return 1;   // 1 to be added to score
            case "2-Point Conversion", "Safety":
                return 2;   // 2 to be added to score
            default:
                return 0;   // Default, no points

        }
    }
}


