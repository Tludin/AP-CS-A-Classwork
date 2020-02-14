
/**
 * Write a description of class tumorFileWriter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class createTumorFile
{
    public static void main(String[] args) throws IOException
    {
        String text = "This file will contain a patient and his tumor";
        FileWriter file = new FileWriter("patientandtumor.txt");
        for(int i = 0; i < text.length(); i++){
            file.write(text.charAt(i));
        }
        System.out.println("All done matey");
        file.close();
    }
}
