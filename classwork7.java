
/**
 * Write a description of class classwork7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class classwork7
{
    //public static void main(String[] args){
       //System.out.println(ulfricStormcloak(2,3));
       //System.out.println("hello " + dovakiin(19));
       //System.out.println("hello " + dovakiin(17));
   // }
    //public static double ulfricStormcloak(int a, int b){   //public static (variable type) (variable name, (given))
        //return a + b;
    //}
    //public static String dovakiin(int age){
        //if(age >= 18){
            //return "You can vote";
        //}else{
            //return "You can't vote";
        //}
    //}
    public static void main(String[] args){
        int banditHP = 20;
        int damage = playerDamage(4);
        System.out.println("You dealt " + damage + " damage");
        banditHP = banditHP - damage;
        System.out.println(banditHP);
        System.out.println(welcomeToWarmadens((int)(Math.random()*3)+1));
    }
    public static int playerDamage(int d){
        int damage = (int)(Math.random()*d)+1;
        return damage;
    }
    public static String welcomeToWarmadens(int d){
        if(d == 1){
            return "Welcome";
        }else if(d == 2){
            return "Looking to protct your self or deal some damage";
        }else{
            return "Here at Warmaden's we have the finest weapons and armour";
        }
    }
}
