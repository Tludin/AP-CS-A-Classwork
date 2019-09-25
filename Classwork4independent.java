
/**
 * Write a description of class Classwork4independent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Classwork4independent
{
    public static void main(String[] args){
        System.out.println("Welcome to warmadens, looking to protect yourself or deal some damage?");
        Scanner dovakiin = new Scanner(System.in);
        
        String answer = dovakiin.nextLine();
        
        if (answer.equals("What have you got for sale")){
            System.out.println("The finest weapons and armour");
        }else if(answer.equals("Can I use your forge?")){
            System.out.println("Look just ou arond the back!");
        }else{
            System.out.println("Have a good day");
        }
        
        
    }
}
