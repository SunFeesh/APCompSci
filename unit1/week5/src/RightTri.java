import java.util.Scanner;

public class RightTri {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int side1, side2, side3;
        
        System.out.println("Side 1? ");
        side1 = input.nextInt();
        
        System.out.println("Side 2? ");
        side2 = input.nextInt();
        
        System.out.println("Side 3? ");
        side3 = input.nextInt();
        
        while( !rightCheck(side1, side2, side3)) {
            System.out.println("Not a real triangle. Try again!");
            
            System.out.println("Side 1? ");
            side1 = input.nextInt();
        
            System.out.println("Side 2? ");
            side2 = input.nextInt();
        
            System.out.println("Side 3? ");
            side3 = input.nextInt();
        }


        
        System.out.println(rightCheck(side1, side2, side3));
        
    }
    
    public static boolean rightCheck(int one, int two, int three) {
        
        int sqr1 = one*one, sqr2 = two*two, sqr3 = three*three;
        
        if(sqr1 + sqr2 == sqr3 || sqr1 + sqr3 == sqr2 || sqr2 + sqr3 == sqr1) {
            return true;
        } else {
            return false;
        }

    }
    
}
