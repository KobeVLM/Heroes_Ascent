package util;

public class ConsoleUtils {
    // Method to clear the console screen
    public static void clearScreen() {
        // ANSI escape code to clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
