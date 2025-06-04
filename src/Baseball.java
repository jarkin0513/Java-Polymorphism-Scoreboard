import java.util.List;

/**
 * The Baseball class represents a game of baseball.
 * This class extends the abstract Sport class and provides implementations for its abstract methods.
 */
public class Baseball extends Sport {

    /**
     * Constructor for the Baseball class.
     * Sets the period length and name. Also defines the different scoring methods to be used and sets the teams.
     *
     * @param homeTeam The home team.
     * @param awayTeam The away team.
     */
    public Baseball(Team homeTeam, Team awayTeam) {
        // Set period length and name
        periodName = "Inning";
        periodLength = 9;

        // Define the scoring methods for football
        scoringMethods = List.of(
                new ScoringMethod("1-Run Homer"),
                new ScoringMethod("2-Run Homer"),
                new ScoringMethod("3-Run Homer"),
                new ScoringMethod("Grand Slam")
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
            case "1-Run Homer":
                return 1;   // 1 to be added to score
            case "2-Run Homer":
                return 2;   // 2 to be added to score
            case "3-Run Homer":
                return 3;   // 3 to be added to score
            case "Grand Slam":
                return 4;   // 4 to be added to score
            default:
                return 0;   // Default, no points
        }
    }
}
