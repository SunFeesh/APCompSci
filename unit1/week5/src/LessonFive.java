public class LessonFive {
    
    public static void main(String[] args) {
        
        System.out.println(isPerfectSquare(5));
        System.out.println(isPerfectSquare(10));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(18800));
        
    }

    public static boolean isPerfectSquare(int num) {
        
        if (num < 0)
            return false;
        
        int square = (int)Math.sqrt(num);
        
        //return num == (square)*(square);
        
        if(num == (square)*(square))
            return true;
        else
            return false;
        
        
    }

    
}