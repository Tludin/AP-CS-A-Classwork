
/**
 * Write a description of class Gothmog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gothmog extends Balrogs
{
   private String orders;
   private boolean isCool;
   public Gothmog(){
       super();
       orders = "F****** destroy Gondolin";
       isCool = true;
   }
   public Gothmog(String n, int str, int nO, String ord){
       super(n, str, nO);
       orders = ord;
       isCool = true;
   }
   public String getOrders(){
       return orders;
   }
   public void setOrders(String ord){
       orders = ord;
   }
   public String toString(){
       return super.toString() + " Orders: " + orders + " And is he cool: " + isCool;
   }
   public int swingAxe(){
       System.out.println("Gothmog swings his axe");
       int damage = ((int)(Math.random()*50)+1)*super.getStrength();
       return damage;
   }
   public void rallyOrcs(){
       int numberOrcs = super.getNumberOrcs() + 100;
       super.setNumberOrcs(numberOrcs);
   }
}
