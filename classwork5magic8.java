
/**
 * Write a description of class classwork5magic8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class classwork5magic8
{
    public static void main(String[] args){
        boolean gameMode = true;
        while(gameMode == true){
        System.out.println("ask me a question");
        System.out.println("say quit so stop the program");
        Scanner thorin = new Scanner(System.in);
        String input  = thorin.nextLine();
        double result  = (int)(Math.random()*6)+1;
        if(result == 1){
            System.out.println("Merry Lo! Merry Lo! Old Tom Bombadillo!");
        }else if(result ==2){
            System.out.println("One does not simply walk into Mordor");
        }else if(result ==3){
            System.out.println("Looks Like meat's back on the menu!");
        }else if(result ==4){
            System.out.println("FOOL OF A TOOK!!");
        }else if(result ==5){
            System.out.println("My Preacous...!");
        }else if(result ==6){
            System.out.println("*Mumakil noises*");
        }
        if(input.equals("quit")){
            gameMode = false;
        }
    }
    }
}
