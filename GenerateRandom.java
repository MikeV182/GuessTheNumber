import java.util.*;

class GenerateRandom {
    private Random rand = null;
    private int generatedNumber;

    public GenerateRandom(int range) {
        rand = new Random();
        generatedNumber = rand.nextInt(range);
        System.out.println("Guess the number between 0 and " + range);
    }

    public boolean userGuess(int userNumber) {
        if (userNumber == generatedNumber) {
            return true;
        } else if (userNumber > generatedNumber) {
            System.out.println("Way too big");
            return false;
        } else {
            System.out.println("Too small");
            return false;
        }
    }
    
}
