import java.util.Scanner;

public class Multiples {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Multiple? ");
        int multiplier = in.nextInt();
        multiply(multiplier);
        
    }

    public static void multiply(int multi) {
        int num = 1;
        for (int a = 1; a < 12; a++) {
            
            System.out.println(num + " * " + multi + " = " + (num*multi));
            num += 1;
            
        }

        
        
        
        
    }

}
