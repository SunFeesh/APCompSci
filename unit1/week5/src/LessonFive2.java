import java.util.Scanner;

public class LessonFive2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter Value Between 1 and 10: ");
        int choice = input.nextInt();
        
        while(choice < 1 || choice > 10) {
        
            
            System.out.println("You input the wrong value, try again");
            System.out.println("Please Enter Value Between 1 and 10: ");
            choice = input.nextInt();
            
            
        }
        
        System.out.println("Thanks.");        
        
        
    }

    
    
    
    
}