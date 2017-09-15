import java.util.Scanner;

public class LessonFour {
    
    public static void main(String[] args) {
        //printSomething stuff
        //Scanner input = new Scanner(System.in);
        //String firstName;
        //System.out.print("Name? ");
        //firstName = input.nextLine();
        //printSomething(firstName, 17);
        
        largest(7, 10);
        
    }
    
    public static void largest(int one, int two) {
        
        // >= greater than or equal
        // <= less than or equal
        // != not equal
        // == equal
        // = is assignment, dont use
        // && and
        // || or
        
        if(one > two || one != two) {
            
            System.out.println("Largest Variable is " + one);
            
        } else if(two > one) {
            
            System.out.println("Largest Variable is " + two);
            
        } else {
            
            System.out.println(one + " and " + two + " are equal!");
            
        }
        
    }
    
    
    public static void printSomething(String name, int age) {
     
        System.out.println("in method printSomething");
        System.out.println(name);
        
    }
}