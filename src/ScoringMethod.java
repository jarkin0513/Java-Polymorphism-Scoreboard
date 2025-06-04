/**
 * The ScoringMethod class represents a scoring method used in a sport.
 */
public class ScoringMethod {

    private String name;    // Name of scoring method

    /**
     * Constructor for ScoringMethod.
     * Initializes the name of the scoring method used.
     * @param name The name of the scoring method used.
     */
    public ScoringMethod(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the scoring method used.
     * @return The name of the scoring method used.
     */
    public String getName() {
        return name;
    }
}
