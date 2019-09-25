

import java.util.Scanner;
public class Classwork3
{
   public static void main(String[] args)
   {
    /** Objective #1: Write an application to accept a side length for a prism,
        * and output the volume of a cube.
        *
        * Precondition: The user enters a number for the side length, and not a special character or letter
        * Postcondition: The program outputs a volume if the user enters a positive number. If the user
        *       does not enter a positive number, the program responds with "Invalid Input"
        */
   
    Scanner osgiliath = new Scanner(System.in);
    //System.out.println("Please enter a side length (a number) , this will be the side length of the cube");
    //double theWitchKingOfAngmar = osgiliath.nextDouble();
    //if (theWitchKingOfAngmar > 0)
    //{
        //double minasTirith = Math.pow(theWitchKingOfAngmar,3);
        //System.out.println("Volume: " + minasTirith);
    //}else{
        //System.out.println("Invalid Entry");
    
    

    /** Objective #2: Write an application to solve a quadratic equation, which accepts a, b and c
        * from a user, and outputs one of the solutions to the equation.
        * Precondition: User enters a number
        * Postcondition: If there are two solutions, the program outputs: Two solutions, same with no and one solution.
        */      
    System.out.println("Enter a");
    double a = osgiliath.nextDouble();
    
    System.out.println("Enter b");
    double b = osgiliath.nextDouble();
    
    System.out.println("Enter c");
    double c = osgiliath.nextDouble();
    
    double discriminant = b*b - 4*a*c;
    if (discriminant <= 0){
        System.out.println("no real solutions");
    }
    else if (discriminant == 0)
    {
        System.out.println("one solution");
    }else{
        System.out.println("Two Solutions");
    }
        
  
    
    }


}