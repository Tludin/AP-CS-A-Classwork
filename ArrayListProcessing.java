
/**
 * Write a description of class ArrayListProcessing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class ArrayListProcessing
{
    public static void main(String[] args){
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("Softball");
        sports.add("Soccer");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Soccer");
        sports.add("Skiing");
        sports.add("Rowing");
        shuffleElements(sports);
    }
    public static void printElements(ArrayList<String> e){
        for( int i = 0; i < e.size(); i++){
            System.out.println(e.get(i));
        }
    }
    public static void insertElement(ArrayList<String> e, String g){
        e.add(0, g);
        for( int i = 0; i < e.size(); i++){
            System.out.println(e.get(i));
        }
    }
    public static String returnElement(ArrayList<String> e, int i){
        return(e.get(i));
    }
    public static void removeThirdElement(ArrayList<String> e){
        e.remove(2);
        for( int i = 0; i < e.size(); i++){
            System.out.println(e.get(i));
        }
    }
    public static int searchForElement(ArrayList<String> e, String g){
        for( int i = 0; i < e.size(); i++){
            if((e.get(i)).equals(g)){
                return i;
            }
        }
        return -1;
    }
    public static int searchAndCountElements(ArrayList<String> e, String g){
        int count = 0;
        for( int i = 0; i < e.size(); i++){
            if((e.get(i)).equals(g)){
                count++;
            }
        }
        return count;
    }
    public static ArrayList<String> copyAndReturnList(ArrayList<String> e){
        ArrayList<String> yee = new ArrayList<String>();
        for( int i = 0; i < e.size(); i++){
            yee.add(e.get(i));
        }
        return yee;
    }
    public static void shuffleElements(ArrayList<String> e){
        int die;
        for(int i = 0; i < e.size(); i++){
            die = (int)((Math.random()*(e.size()-i))+i);
            e.add(0,e.get(die));
            e.remove(die+1);
        }
        printElements(e);
    }
    public static void reverseElements(ArrayList<String> e){
        for(int i = 0; i < e.size(); i++){
            e.add(i, e.get(e.size() - 1));
            e.remove(e.size() - 1);
        }
        printElements(e);
    }
}
