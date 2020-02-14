
/**
 * Write a description of class readTumorFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class readTumorFile
{
  public static void main(String[] args) throws IOException
  {
      int a;
      FileReader file = null;
      try
      {
          file = new FileReader("Text");
      }catch(FileNotFoundException fe){
          System.out.println("No File Here Dumbass");  
      }
      while((a=file.read())!=-1){
        System.out.println((char)a);
      }
      file.close();
  }
}
