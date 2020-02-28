
/**
 * Write a description of class Balrogs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrogs
{
    private String name;
    private int strength;
    private int numberOrcs;
    public Balrogs(){
        name = "Gothmog";
        strength = 100;
        numberOrcs = 20000;
    }
    public Balrogs(String n, int str, int nO){
        name = n;
        strength = str;
        numberOrcs = nO;
    }
    public String getName(){
        return name;
    }
    public int getStrength(){
        return strength;
    }
    public int getNumberOrcs(){
        return numberOrcs;
    }
    public void setName(String n){
        name = n;
    }
    public void setStrength(int str){
        strength = str;
    }
    public void setNumberOrcs(int nO){
        numberOrcs = nO;
    }
    public String toString(){
        return "name: " + name + " Strength: " + strength + " Number Of Orcs In Warband " + numberOrcs;
    }
}
