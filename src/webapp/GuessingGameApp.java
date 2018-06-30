package webapp;

import java.util.Scanner;

public class GuessingGameApp {
    
    public static void main(String[] args) {
       Game game = new Game();
    	
    	// game.displayWelcomeMessage();

        // replace with code to get input from front end
        Scanner sc = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // generate the random number and invite user to guess it
            int number = game.getRandomNumber();
            
            // display Please guessMessage on index.html
            // game.displayPleaseGuessMessage();

            // continue until the user guesses the number
            int guessNumber = 0;
            int counter = 1;
            while (guessNumber != number) {
            	
                // get a valid int from user - from front end
                // guessNumber = Console.getIntWithinRange(sc, "Enter number: ", 0, 101);
            	// validate on front end

                // display result of guess to user
                if (guessNumber == number) {
                	// have front end display correct guess message
                    // game.displayCorrectGuessMessage(counter);
                } else {
                    // get another guessNumber from front end
                	//game.displayGuessAgainMessage(number, guessNumber);
                }
                counter++;
            }

            // see if the user wants to continue
            // put reset button on index.html
            // link to reset game in this file
            // choice = Console.getChoiceString(sc, "Try again? (y/n): ", "y", "n");
            // System.out.println();
        }

    }
}


	
