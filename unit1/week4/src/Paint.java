//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint {

        public static void main(String[] args) {

            final int coverage = 350;  //paint covers 350 sq ft/gal
            
            //declare integers length, width, and height;
            int length, width, height;
            //declare double totalSqFt;
            double totalSqFt;
            //declare double paintNeeded;
            double paintNeeded;
            //Declare and initialize the length of the room
            length = 15;
            //Declare and initialize the width of the room
            width = 11;
            //Declare and initialize the height of the room
            height = 8;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            int side1, side2, side3, side4, ceiling;
            side1 = length * height;
            side2 = length * height;
            side3 = width * height;
            side4 = width * height;
            ceiling = length * width;
            
            int door = 20, window = 15;
            
            totalSqFt = side1 + side2 + side3 + side4 + ceiling - door - (2 * window);
            //Compute the amount of paint needed
            paintNeeded = totalSqFt / coverage;
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println("Length: " + length + " Width: " + width + " Height: " + height);
            System.out.println("Paint Needed: " + paintNeeded);
            
        }
}
