// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Rock {

    public static void main(String[] args) {

        String personPlay1, personPlay2;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
      	                      //computer's play
        Random seed = new Random();
        Scanner input = new Scanner(System.in);
        
        //Get player's play -- note that this is stored as a string
        System.out.print("R, P, or S? ");
        personPlay1 = input.next();
        
        //Make player's play uppercase for ease of comparison
        personPlay2 = personPlay1.toUpperCase();
        
        //Generate computer's play (0,1,2)
        computerInt = seed.nextInt(3);
        
        //Translate computer's randomly generated play to string
        if (computerInt == 0) {
            computerPlay = "R";
        } else if (computerInt == 1) {
            computerPlay = "P";
        } else {
            computerPlay = "S";
        }  
        
        //Print computer's play
        System.out.println("Computer Throws: " + computerPlay);
        System.out.println();
      
        //See who won.
        game(computerPlay, personPlay2);

    input.close();
    }

    public static void game(String C, String P){
       //When Computer Throws Rock...
       if (C.equals("R")){
            if(P.equals("P")){
                win();
            } else if (P.equals("R")) {
                tie();
            } else if (P.equals("S")) {
                lose();
            } else {
                error();
            }
        //When Computer Throws Paper...
        } else if (C.equals("P")) {
            if(P.equals("R")){
                lose();
            } else if (P.equals("P")){
                tie();
            } else if (P.equals("S")){
                win();
            } else {
                error();
            }
      //When Computer Throws Scissors...
        } else {
            if(P.equals("R")){
                win();
            } else if (P.equals("P")){
                lose();
            } else if (P.equals("S")){
                tie();
            } else {
                error();
            }
        }

    
    }


    public static void win(){
         System.out.println("You Win! (*≧▽≦)");
    }
    
    public static void tie(){
        System.out.println("It's a Tie!");
    }
    
    public static void lose(){
        System.out.println("You Lose ;w;");      
    }

    public static void error(){      
        System.out.println("Did you throw a correct letter?");
    }







}
