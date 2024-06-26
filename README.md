# HangmanWithDictionaryFile

You created a Wheel of Fortune project in Ch 9 in the previous Java course. In that version, you hard-coded the array of letters for the word the user needed to guess. In this version (called Hangman because it's shorter for this long project name), you will write a series of 6 words into a file which will serve as the dictionary of words for the game. When the project starts, that dictionary will be read into an array of words, and a random number will select which one is used in the play of the game. The rest of the game is the same as the project in Ch 9.

Before you begin, be sure to look at the Try It Out exercises in the additional reading in Canvas, "Reading about File Processing".

The file for this dictionary is “words.txt”, and it will contain 6 words that are input by the user. The words can be of different lengths. There need to be 6 words so there are enough to see different words chosen for the play of the game. You can use a larger number, but know that you have to enter all of those words at least once to get them into the dictionary. Six is enough to see different words chosen by random number, but not so large that entering the data becomes burdensome.

COPY the Wheel of Fortune project from Ch 9. In the class file, remove the hard-coding for the array that holds the letters of the word. In the constructor, add a parameter for a word, determine the size variable as the length of that word to create a 2D array of that size, and populate the 2D array with the letters from that word that was passed into the constructor.

There will be significant changes in the driver file. First, you need to check for the existence of the file “words.txt”. If it exists, then the user has already entered the words for the dictionary and the program can skip to the following section. If the file does not exist, then the user needs to enter 6 words, each written to a file named “words.txt”. Notice that by checking if the file exists, you don’t have to enter the dictionary words every time you test the program. If you want to create a new file of words, delete the words.txt file from the project folder. If the file exists, you will see this in the folder.

The next section of the driver reads in the entries in the file and stores them in an array of words. A random number determines which word will be used in each play of the game.

In a loop, generate a random number to select the word, then play the game as in Ch 9's Wheel of Fortune project. After the word is guessed, ask the user if they want to play again. If the answer is yes, generate a new random number to pick the word and play again.

Run the project without a file in the folder, so it has to create it, and add 6 words. Take a screenshot that shows those words and the beginning of the game. Play the game until you guess the word, and take a screenshot of the game-over portion of the screen. Close the project. Open it again, so that now the dictionary file exists in the folder, and run the project. Take a screenshot of the beginning of that execution.

# Ouput

![output](https://github.com/bell-kevin/HangmanWithDictionaryFile/blob/main/saveMeAgain.PNG)

More Output

![more output](https://github.com/bell-kevin/HangmanWithDictionaryFile/blob/main/saveMe.PNG)

Submission:the specified screenshots and the root folder for the project

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](https://bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
email me at **bellKevin@pm.me** for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
