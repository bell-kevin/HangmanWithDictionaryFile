/** ****************************************************************************
 * HangmanWithDictionaryFile.java
 * Kevin Bell
 *
 * The program allows users to guess letters in a secret word game
 **************************************************************************** */
package hangmanwithdictionaryfile;

import java.util.Scanner;
import java.io.*;

public class HangmanWithDictionaryFile {

    public static void main(String[] args) {
        System.out.println("Ch 9 Hangman by Kevin Bell\n");
        File outputFile = new File("words.txt");
        FileWriter out;
        BufferedWriter writeFile;
        Scanner computerKeyboardInput = new Scanner(System.in);
        String word;
        try {
            out = new FileWriter(outputFile);
            writeFile = new BufferedWriter(out);
            for (int i = 0; i < 6; i++) {
                System.out.print("Enter new word: ");
                word = computerKeyboardInput.nextLine();
                writeFile.write(word);
                writeFile.newLine();
            } // end for loop
            writeFile.close();
            out.close();
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println("Problem writing to file.");
            System.out.println("Exception: " + e.getMessage());
        } // end try/catch block
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
