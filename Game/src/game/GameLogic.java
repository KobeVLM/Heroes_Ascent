package game;

public class GameLogic {
    public GameLogic() {
        // Initialize game state here if needed
    }

    public void displayMenu() {
        System.out.println("=== Main Menu ===");
        System.out.println("1. Start Game");
        System.out.println("2. End Game");
    }

    public boolean processInput(String input) {
        switch (input) {
            case "1":
                startGame();
                return true;
            case "2":
                return false;
            default:
                System.out.println("Unknown command. Please enter 1 or 2.");
                return true;
        }
    }

    private void startGame() {
        System.out.println("Starting the game...");
        // Add game start logic here
    }
}
