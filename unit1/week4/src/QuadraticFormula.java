import java.util.Scanner;

public class QuadraticFormula {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double a, b, c, rooted, answer1, answer2;
        
        //input..
        System.out.print("a value? ");
        a = input.nextDouble();
        System.out.print("b value? ");
        b = input.nextDouble();
        System.out.print("c value? ");
        c = input.nextDouble();
        
        //Check a..
        if (a == 0){
            System.out.println("a Cannot Be Zero. Try Again!");
            return;
        } else {}

        //Check if real..
        rooted = (b*b) - (4*a*c);
        
        if (rooted < 0) {
            System.out.println("The answers are not real numbers.");
            return;
        } else {}
        
        //actually do the *math*
        answer1 = ((0-b) + rooted) / (2*a);
        answer2 = ((0-b) - rooted) / (2/a);
        
        //print answer
        System.out.println("Your answers are " + answer1 + " and " + answer2);
        
        
    
    }

    
    
}
