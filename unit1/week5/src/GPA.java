import java.util.Scanner;

public class GPA {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gpa;
        
        System.out.print("What is your GPA? ");
        gpa = input.nextDouble();
        
        check(gpa);     
        
        
    }

    public static void check(double num) {
        Scanner input = new Scanner(System.in);
         while(num < 0 || num > 4.75) {
                System.out.println("That wasn't valid, try again");
                System.out.print("What is your GPA? ");
                num = input.nextDouble();
            }

        if(num > 3.75 && num <= 4.75) {
            System.out.println("Something Witty");      
        } else if(num <= 3.75 && num > 3.0) {
            System.out.println("GoodJob");
        } else if(num <= 3.0 && num > 2.5) {
            System.out.println("Could be worse");
        } else if(num <= 2.5 && num >= 0) {
            System.out.println("It's worse");
        } else if(num < 0 || num > 4.75) {           

        } else{
        }   
        
    }

    
}
