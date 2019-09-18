
/**
 * Write a description of class classwork5independent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class classwork5independent
{
   public static void main(String[] args){
       boolean gameMode = true;
       System.out.println("in this game type what is in the parentahtes as your choice");
       System.out.println("/nYou see a bandit, do you try to (sneak) by the bandit or (attack) the bandit?");
       Scanner choice = new Scanner(System.in);
       String input = choice.nextLine();
       String banditAttack = ("undeclared");
       double playerHP = 20;
       double banditHP = 15;
       if(input.equals("sneak")){
           System.out.println("'Never should have come here' says the bandit, the bandit attacks you!");
           while (gameMode == true){
               System.out.println("the bandit attacks you, Do block at your (leg) (head) or (chest)?");
               double banditAttackNum  = (int)(Math.random()*3)+1;
               String playerDefence = choice.nextLine();
               if(banditAttackNum == 1){
                   banditAttack = ("leg");
                }else if(banditAttackNum == 2){
                    banditAttack = ("head");
                }else if(banditAttackNum == 3){
                    banditAttack = ("chest");
                }
               if(banditAttack.equals(playerDefence)){
                   System.out.println("You blocked the attack!");
                }
            }
       } else if(input.equals("attack")) {
           System.out.println("You charge the bandit, he seems suprised!");
           while (gameMode == true){
            }
       }
   }
}
