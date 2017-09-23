// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess {

    public static void main(String[] args) {

          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(10) + 1;
 
          //print message asking user to enter a guess
          System.out.print("Guess a number! ");
 
          //read in guess
          guess = scan.nextInt();

   //keep going as long as the guess is wrong          
          while (guess != numToGuess) {
                  //print message saying guess is wrong
                  System.out.println("Wrong!");
                  //get another guess from the user
                  System.out.println("Try again! ");
                  guess = scan.nextInt();
          }
 
          //print message saying guess is right
          System.out.println("Correct!");
   }
}

