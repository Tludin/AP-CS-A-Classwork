
/**
 * Write a description of class Classwork2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Classwork2
{
    public static void main(String[] args)
    {
        //We consructed a scanner object
            //Scanner theScanOfGondor = new Scanner(System.in);
        
            //Give the user a prompt
            //System.out.println("In the name of Skyrim and her people enter your age:");
        
            //double theLastAllaimceBetweenMenAndElvesUserInput = theScanOfGondor.nextDouble();
        
            //double gandalfTheWhiteCompareAge = 36/theLastAllaimceBetweenMenAndElvesUserInput;
        
            //System.out.println("You Are " + gandalfTheWhiteCompareAge + " untimes Ms. kennedys age");
        // my example: Give the usr a prompt
            //Scanner accelerationScan = new Scanner(System.in);
            //Scanner timeScan = new Scanner(System.in);
            //Scanner velocityScan = new Scanner(System.in);
            //Scanner positionintScan = new Scanner(System.in);
        
            //System.out.println("Please enter the acceleration of the particle");
            //double acceleration = accelerationScan.nextDouble();
        
            //System.out.println("Please enter the time the object is accelerating for");
            //double time = timeScan.nextDouble();
        
            //System.out.println("Please enter the initial velocity of the particle");
            //double velocity = velocityScan.nextDouble();
        
            //System.out.println("Please enter the inital position of the particle");
            //double positionint = positionintScan.nextDouble();
        
            //double deltaPosition = velocity*time + 0.5*acceleration*Math.pow(time,2);
            //double newPosition = deltaPosition + positionint;
        
            //System.out.println("The particle traveled " + deltaPosition + " Meters to a now position of " + newPosition +" meters");
        
            
            Scanner input = new Scanner(System.in);
            System.out.println("Have you ever read Lord Of The Rings? (answer as Y or N)");
            String  userInput = input.nextLine();
            if (userInput.equals("Y")){
                System.out.println("You are worthy");
    }       else {
                System.out.println("You are dumb");
    }
  }
}