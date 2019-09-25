
/**
 * Write a description of class Classwork4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Classwork4 //class header, has curly brackets afterwards
{
    public static void main(String[] args){ //method header
        
        Scanner bilbo = new Scanner(System.in);
        //Write a program that asks for and stores a person's name!
        System.out.println("what is your name? ");
        
        String smaug = bilbo.nextLine();
        
        if (smaug.equals("Bilbo Baggins") || smaug.equals("bilbo baggins")){
            System.out.println("BILBO BAGGINS! DO NOT TAKE ME FOR A CONJUROR OF CHEAP TRICKS!");
        }else if(smaug.equals("the balrog of morgoth") || smaug.equals("The Balrog Of Morgoth")){
            System.out.println("YOU SHALL NOT PASS!");
        }else{
            System.out.println("You are wrong "+smaug+" that is not you name, go change it");
        }
    }
}
