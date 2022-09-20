/** ****************************************************************************
 * HangmanWithDictionaryFile.java
 * Kevin Bell
 *
 * The program allows users to guess letters in a secret word game
 **************************************************************************** */
package hangmanwithdictionaryfile;

import java.util.Scanner;

public class HangmanWithDictionaryFile {

    public static void main(String[] args) {
        System.out.println("Ch 9 Hangman by Kevin Bell\n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter new word: ");
            String word = computerKeyboardInput.nextLine();
        } // end for loop
        Game game = new Game("testing"); //create a new game
        String input;
        char guess;
        //play game
        game.display(); //display the board
        do {
            System.out.print("Guess a letter: ");
            input = computerKeyboardInput.nextLine();
            guess = input.charAt(0);
            game.findLetter(guess); //find letter           
        } while (!game.isGameOver()); //check if game over
        //end game
        System.out.println("Congratulations, game is over");
    } // end main method
} // end HangmanWithDictionaryFile class
