
/**
 * Write a description of class lordOfTheRingsCharicter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class orcRecruits
{
   //instance variables are the adjectives to describe your object
   private String name;
   private String clan;
   private double finalTest;
   private int regement;
   private boolean alive;
   //Constructor defenition
   public orcRecruits(String nam, String cla, double finalT, int reg, boolean aliv){
       name = nam;
       clan = cla;
       finalTest = finalT;
       regement = reg;
       alive = aliv;
    }
   //a mutator method for changeing provate data
   public void setName(String n){
       name = n;
    }
   //accessor method to access the private data
   public String getName(){
       return name;
    }
    
    
   public void setClan(String c){
       clan = c;
    }
   public String getClan(){
       return clan;
    }
    
   public void setFinal(double f){
       finalTest = f;
    }
   public double getFianl(){
       return finalTest;
    }
    
   public void setRegement(int r){
       regement = r;
    }
   public int getRegement(){
       return regement;
    }
    
   public void setAlive(boolean a){
       alive = a;
    }
   public boolean getAlive(){
       return alive;
    }
}
