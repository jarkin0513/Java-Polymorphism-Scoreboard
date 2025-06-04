import java.util.Scanner;

/**
 * The Main class is the entry point of the application.
 * It handles user input and controls the flow of the game.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // Scanner for user input
        boolean isValidGameChoice = false;  // Flag used for validating game choice selection
        Sport game = null;  // Sports instance, variable to hold selected game

        // Game selection loop
        do {
            System.out.println("Select The Type of Game:");
            System.out.println("1. Football");
            System.out.println("2. Baseball");
            System.out.println("3. Soccer");
            System.out.println("4. Hockey");
            System.out.println("Enter Choice:");
            int gameChoice = scanner.nextInt();

            // Validate game choice
            if (gameChoice < 1 || gameChoice > 4) {
                System.out.println("Invalid game choice. Please try again.");
            } else {
                isValidGameChoice = true;
            }

            // Get team names
            System.out.println("Enter Home Team:");
            String homeTeamName = scanner.next();
            System.out.println("Enter Away Team:");
            String awayTeamName = scanner.next();
            Team homeTeam = new Team(homeTeamName);
            Team awayTeam = new Team(awayTeamName);

            // Create game based on user choice
            if (gameChoice == 1) {
                game = new Football(homeTeam, awayTeam);
                game.startGame();
            } else if (gameChoice == 2) {
                game = new Baseball(homeTeam, awayTeam);
                game.startGame();
            } else if (gameChoice == 3) {
                game = new Soccer(homeTeam, awayTeam);
                game.startGame();
            } else if (gameChoice == 4) {
                game = new Hockey(homeTeam, awayTeam);
                game.startGame();
            }

        } while (!isValidGameChoice);


        int choice;
        boolean validChoice = false;

        // Game loop
        do {
            // Display game status, scores and current period
            System.out.println(game.getTeams()[0].getTeamName() + " - " + game.getScores()[0] + ", "
                    + game.getTeams()[1].getTeamName() + " - " + game.getScores()[1]);
            System.out.println("Current " + game.getPeriodName() + ": " + game.getCurrentPeriod());

            // Display scoring methods menu
            System.out.println("Menu:");
            int i = 1;
            for (ScoringMethod method : game.getScoringMethods()) {
                System.out.println(i + ". " + method.getName());
                i++;
            }
            System.out.println(i + ". End " + game.getPeriodName());
            System.out.println("Enter Choice: ");
            choice = scanner.nextInt();

            // Handle user's choice, ensure input is valid
            if (choice >= 1 && choice <= game.getScoringMethods().size()) {
                ScoringMethod scoringMethod = game.getScoringMethods().get(choice - 1);

                // Team selection loop
                do {
                    System.out.println("1. " + game.getTeams()[0].getTeamName());
                    System.out.println("2. " + game.getTeams()[1].getTeamName());
                    System.out.println("Enter Team Choice:");
                    String teamChoice = scanner.next();

                    // Validate team choice
                    if (teamChoice.equals("1") || teamChoice.equals("2")) {
                        validChoice = true;
                        choice = Integer.parseInt(teamChoice);
                    } else {
                        System.out.println("Invalid team choice. Please enter 1 or 2 for the corresponding team you want to select.");
                    }
                } while (!validChoice);

                // Add score to selected team
                Team scoringTeam = game.getTeams()[choice - 1];
                game.addScore(scoringMethod, scoringTeam);

                // End current period
            } else if (choice == game.getScoringMethods().size() + 1) {
                game.endPeriod();
            } else {
                System.out.println("Invalid Choice. Please Try Again");
            }
        } while (!game.isGameOver());

        // Display final game results
        System.out.println("Game Over!");
        System.out.println(game.getTeams()[0].getTeamName() + " - " + game.getScores()[0] + ", "
                + game.getTeams()[1].getTeamName() + " - " + game.getScores()[1]);
        System.out.println("Current " + game.getPeriodName() + ": Final");

        // Display winning team
        Team winningTeam = game.getWinningTeam();
        if (winningTeam != null) {
            System.out.println("Winner: " + winningTeam.getTeamName());
        } else {
            System.out.println("It's A Tie!");
        }


        scanner.close();    // Close scanner
    }


}