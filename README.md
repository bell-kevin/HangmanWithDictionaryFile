# HangmanWithDictionaryFile

You created a Wheel of Fortune project in Ch 9 in the previous Java course. In that version, you hard-coded the array of letters for the word the user needed to guess. In this version (called Hangman because it's shorter for this long project name), you will write a series of 6 words into a file which will serve as the dictionary of words for the game. When the project starts, that dictionary will be read into an array of words, and a random number will select which one is used in the play of the game. The rest of the game is the same as the project in Ch 9.

Before you begin, be sure to look at the Try It Out exercises in the additional reading in Canvas, "Reading about File Processing".

The file for this dictionary is “words.txt”, and it will contain 6 words that are input by the user. The words can be of different lengths. There need to be 6 words so there are enough to see different words chosen for the play of the game. You can use a larger number, but know that you have to enter all of those words at least once to get them into the dictionary. Six is enough to see different words chosen by random number, but not so large that entering the data becomes burdensome.

COPY the Wheel of Fortune project from Ch 9. In the class file, remove the hard-coding for the array that holds the letters of the word. In the constructor, add a parameter for a word, determine the size variable as the length of that word to create a 2D array of that size, and populate the 2D array with the letters from that word that was passed into the constructor.

There will be significant changes in the driver file. First, you need to check for the existence of the file “words.txt”. If it exists, then the user has already entered the words for the dictionary and the program can skip to the following section. If the file does not exist, then the user needs to enter 6 words, each written to a file named “words.txt”. Notice that by checking if the file exists, you don’t have to enter the dictionary words every time you test the program. If you want to create a new file of words, delete the words.txt file from the project folder. If the file exists, you will see this in the folder:

Ch 16 Dictionary files

The next section of the driver reads in the entries in the file and stores them in an array of words. A random number determines which word will be used in each play of the game.

In a loop, generate a random number to select the word, then play the game as in Ch 9's Wheel of Fortune project. After the word is guessed, ask the user if they want to play again. If the answer is yes, generate a new random number to pick the word and play again.

Here is the beginning of execution when the file already exists:

Ch 16 Dictionary file exists

Here is the beginning of execution when the file does not already exist:

Ch 16 Dictionary file does not exist

The code prompts the user for 6 words to enter into the dictionary. When done, the beginning of a new game displays:

Ch 16 Dictionary new words

Here is the display when the word has been guessed and the game is over:

Ch 16 Dictionary game over

Run the project without a file in the folder, so it has to create it, and add 6 words. Take a screenshot that shows those words and the beginning of the game. Play the game until you guess the word, and take a screenshot of the game-over portion of the screen. Close the project. Open it again, so that now the dictionary file exists in the folder, and run the project. Take a screenshot of the beginning of that execution.

Submission:the specified screenshots and the root folder for the project

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.
