import java.util.Scanner;

public class GuessTheNumber {
    private static GenerateRandom game = null;
    private static Scanner scanner = new Scanner(System.in);
    private static int guess;

    private static void enterField() {
        System.out.print("Your guess: ");
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        game = new GenerateRandom(scanner.nextInt());
        
        enterField();
        guess = scanner.nextInt();
        while (!game.userGuess(guess)) {
            enterField();
            guess = scanner.nextInt();
        }

        System.out.println("That's the number i generated, how did you know?");
    }
}