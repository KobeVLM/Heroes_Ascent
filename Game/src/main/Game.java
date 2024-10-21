package main;

import java.util.Scanner;
import game.GameLogic;

public class Game {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            // Display game options
            gameLogic.displayMenu();

            // Get player input
            System.out.print("Enter choice: ");
            String command = scanner.nextLine();

            // Process player input
            isRunning = gameLogic.processInput(command);
        }

        scanner.close();
        System.out.println("Game over! Thanks for playing. Have a nice day!");
    }
}
