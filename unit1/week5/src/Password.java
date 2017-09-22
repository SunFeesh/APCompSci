import java.util.Scanner;

public class Password {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        final String PASSWORD = "1234";
        final int MAX_TRIES = 5;
        int tries = 0;
        String inputPassword;
        
        System.out.println("WHATS THE PASSWORD");
        System.out.print("~~~ ");
        inputPassword = input.nextLine();
        tries++;
        
        while(!inputPassword.equals(PASSWORD) && tries < MAX_TRIES) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("WRONG PASSWORD");
            System.out.println("you get " + (MAX_TRIES - tries) + " more tries");
            
            System.out.print("TRY AGAIN ");
            inputPassword = input.nextLine();
            tries++;        
        }
        
        if(inputPassword.equals(PASSWORD)) {
            System.out.println("ok welcome home");
        } else {
            System.out.println("get out of my house");
        }



        
    }

    
}
