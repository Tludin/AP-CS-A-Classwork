
/**
 * Write a description of class SiegeOfGondorTicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SiegeOfGondorTicTacToe
{
    public static void main(String[] args){

        System.out.println("Gondor is under siege!!!");
        System.out.println("Gothmog has led his forces in a attempt to destroy the last of the free men of middle earth");
        System.out.println("He must be stopped");
        TicTacToe newSiege = new TicTacToe();
        Scanner checkInput = new Scanner(System.in);
        System.out.println("Player one are Xs and Player two are Os");
        System.out.println(newSiege);
        int move;
         while(true){
            System.out.println("player one make your move");
            move = checkInput.nextInt();
            newSiege.enterX(move);
            System.out.println("");
            System.out.println(newSiege);
            if(newSiege.isThereAVictor() == true){
                System.out.println("player one is victorious");
                break;
            } else if (newSiege.checkTie() == true){
                System.out.println("The battle is a tie");
                break;
            }
            System.out.println("player two make your move");
            move = checkInput.nextInt();
            newSiege.enterO(move);
            System.out.println("");
            System.out.println(newSiege);
            if(newSiege.isThereAVictor() == true){
                System.out.println("player two is victorious");
                break;
            } else if (newSiege.checkTie() == true){
                System.out.println("The battle is a tie");
                break;
            }
        }
    }
}
