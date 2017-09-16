import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    
    public static void main(String args) {
        
        Scanner input = new Scanner(System.in);
        Random seed = new Random();
        
        int guess;
        int randNum = seed.nextInt(10) + 1;
        
        System.out.println("I'm thinking of a number between 1 and 10...");
        System.out.print("Can you guess it? ");
        guess = input.nextInt();
        
        if (randNum == guess){
            System.out.println("Wow, you got it right!");
        } else {
            System.out.println("W R O N G. it was actually " + randNum + ". Better luck next time, loser.");

    }

    input.close();
    }




}
