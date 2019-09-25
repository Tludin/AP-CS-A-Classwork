
/**
 * Write a description of class Classswork3onmyown here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Classswork3onmyown
{
     public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
    System.out.print("\n\n\nThe year is 2:5023");
    System.out.print("\nYou wake up in a forest, your head hurts, a man lies next to you, dead");
    System.out.print("\nYou can either \n a) search man \n b) get up and explore the forest \n(Enter yout answer as a or b)");
    String  userInput = input.nextLine();
    int gameMode = 0;
    if (userInput.equals("a")){
        gameMode = 1;
    } else if (userInput.equals("b")){
        gameMode = 2;
    }else {
        System.out.println("You have quit the game");
    }
    boolean runGame = true;
    int food = 0;
    int damage = 2;
    int goldPeices = 0;
       while (runGame == true){
           if (gameMode == 1){
               System.out.println("On the man you find a dagger, a wheel of chese, and 7 gold peices");
               food += 1;
               boolean dagger = true;
               goldPeices += 7;
               gameMode = 0;
            }
           if (gameMode == 2){
               System.out.println("You explore the forest, you find a cave and some mysterious tracks");
            }
        }
       
       
       
       
       
       
       
       
       
   }
   
}
