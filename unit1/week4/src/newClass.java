import java.util.Scanner;
public class newClass {
    

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Num One? ");
    int first = input.nextInt();
    
    System.out.print("Num Two? ");
    int second = input.nextInt();
    
    compare(first, second);
        
        
    input.close();    
    }
    
    public static void compare(int numOne, int numTwo) {
        
        if (numOne > numTwo) {
            
            System.out.println(numOne + " is the larger number.");
            
        } else if (numOne < numTwo) {
            
            System.out.println(numTwo + " is the larger number.");
            
        } else {
            
            System.out.println("They are equal!!!!!");
            
        }
        
        
    }
    
    
}