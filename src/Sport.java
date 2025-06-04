import java.util.List;

/**
 * Abstract class that represents a sport.
 * This gives a common interface for each of the sports classes.
 */
public abstract class Sport {

    protected Team[] teams; // Array of teams in a game
    protected int[] scores; // Array of scores for each team
    protected int currentPeriod;    // Current period of the game
    protected int periodLength; // Period length for the game
    protected String periodName;    // Period name for the game
    protected List<ScoringMethod> scoringMethods;   // List of scoring methods for each sport

    /**
     * Sets the teams that are in the game and initializes their scores to be 0.
     * @param homeTeam  The home team.
     * @param awayTeam  The away team.
     */
    protected void setTeams(Team homeTeam, Team awayTeam) {
        teams = new Team[] {homeTeam, awayTeam};
        scores = new int[] {0, 0};
    }

    /**
     * Returns the teams participating in a game.
     * @return  The array of teams.
     */
    public Team[] getTeams() {
        return teams;
    }

    /**
     * Returns the scores of the teams.
     * @return  The array of scores.
     */
    public int[] getScores() {
        return scores;
    }

    /**
     * Adds a score to a team.
     * @param scoringMethod The scoring method.
     * @param team  The team that scored.
     */
    public void addScore(ScoringMethod scoringMethod, Team team) {
        // Determine which team scored
        int teamIndex;
        if (team == teams[0]) {
            teamIndex = 0;
        } else {
            teamIndex = 1;
        }

        // Determine the amount to add to the team's score
        int scoreToAdd = determineScore(scoringMethod.getName());

        // Add the score to the team's total
        scores[teamIndex] += scoreToAdd;
    }

    /**
     * Determines the score to add based on the scoring method.
     * Method is overridden by subclasses and implemented based on the scoring methods of each sport.
     * @param scoringMethods    The name of the scoring method.
     * @return  The score to add.
     */
    protected abstract int determineScore(String scoringMethods);

    /**
     * Returns the winning team, if the game is over and there is a winner.
     *
     * @return The winning team, or null if the game is not over or there is a tie
     */
    protected Team getWinningTeam() {
        if (isGameOver()) {
            if (scores[0] > scores[1]) {
                return teams[0];
            } else if (scores[0] < scores[1]) {
                return teams[1];
            } else {
                // Game ends in a tie
                return null;
            }
        } else {
            // Game is not over
            return null;
        }
    }

    /**
     * Returns the scoring methods applicable to the sport.
     *
     * @return A list of scoring methods
     */
    public List<ScoringMethod> getScoringMethods() {
        return scoringMethods;
    }

    /**
     * Starts the game by setting the current period to 1.
     */
    public void startGame() {
        currentPeriod = 1;
    }

    /**
     * Ends the current period and advances to the next one.
     */
    public void endPeriod() {
        currentPeriod++;
    }

    /**
     * Returns the current period of the game.
     *
     * @return The current period
     */
    public int getCurrentPeriod() {
        return currentPeriod;
    }

    /**
     * Returns the name of the period.
     *
     * @return The period name
     */
    public String getPeriodName() {
        return periodName;
    }

    /**
     * Checks if the game is over, which is true if the current period is greater than 4.
     *
     * @return true if the game is over, false otherwise
     */
    public boolean isGameOver() {
        return currentPeriod > periodLength;
    }

}
