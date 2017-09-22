import java.util.Scanner;

public class LargerNum {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numOne, numTwo;
        
        System.out.print("Number 1? ");
        numOne = input.nextInt();
        System.out.print("Number 2? ");
        numTwo = input.nextInt();
        
        int biggest = compare(numOne, numTwo);
        
        System.out.println("Largest integer is " + biggest);
        
        
    }

    public static int compare(int one, int two) {
        int biggest;
        
        if(one > two) {
            biggest = one;
        } else if(one < two) {
            biggest = two;
        } else {
            biggest = one;
        }

        return(biggest);
        
        
    }

    
    
    
}
