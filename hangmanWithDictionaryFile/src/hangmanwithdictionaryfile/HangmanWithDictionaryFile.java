/** ****************************************************************************
 * HangmanWithDictionaryFile.java
 * Kevin Bell
 *
 * The program allows users to guess letters in a secret word game
 **************************************************************************** */
package hangmanwithdictionaryfile;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class HangmanWithDictionaryFile {

    public static void main(String[] args) {
        String filename = "words.txt";
        Path path;
        System.out.println("Ch 9 Hangman by Kevin Bell\n");
        path = Paths.get(filename);
        Scanner computerKeyboardInput = new Scanner(System.in);
        if (Files.exists(path)) {
            System.out.println("Guess a random word from my dictionary.");
        } else {
            File outputFile = new File("words.txt");
            FileWriter out;
            BufferedWriter writeFile;
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
        } // end if/else condition

        // load information from text file
        File textFile = new File("words.txt");
        FileReader in;
        BufferedReader readFile;
        String lineOfText="";
        ArrayList<String> listOfWords = new ArrayList<>();
        try {
            in = new FileReader(textFile);
            readFile = new BufferedReader(in);
            while ((lineOfText = readFile.readLine()) != null) {
                listOfWords.add(lineOfText);
            }
            readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.out.println("Exception: " + e.getMessage());
        }
        //Get random number so you can call that posion of the array list.
        int randomNumber = (int) (Math.random() * 5 + 1);
        Game game = new Game(listOfWords.get(randomNumber)); //create a new game
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
