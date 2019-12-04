
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
    private String[][] thePelennor = new String[3][3];
    public TicTacToe(){
        thePelennor[0][0] = "1";
        thePelennor[0][1] = "2";
        thePelennor[0][2] = "3";
        thePelennor[1][0] = "4";
        thePelennor[1][1] = "5";
        thePelennor[1][2] = "6";
        thePelennor[2][0] = "7";
        thePelennor[2][1] = "8";
        thePelennor[2][2] = "9";
    }
    public TicTacToe(int height, int width){
    }
    public void enterX(int pos){
        int count = 0;
        for(int i = 0;  i < 3; i++){
            for(int j = 0; j<3; j++){
                count++;
                if((count == pos)&&(thePelennor[i][j] != "X")&&(thePelennor[i][j] != "O")){
                    thePelennor[i][j] = "X";
                }
            }
        }
    }
    public void enterO(int pos){
        int count = 0;
        for(int i = 0;  i < 3; i++){
            for(int j = 0; j<3; j++){
                count++;
                if((count == pos)&&(!thePelennor[i][j].equals("X"))&&(!thePelennor[i][j].equals("O"))){
                    thePelennor[i][j] = "O";
                }
            }
        }
    }
    public boolean checkRows(){
        for(int i = 0; i < 3; i++){
            if((thePelennor[i][0].equals(thePelennor[i][1])&&(thePelennor[i][0].equals(thePelennor[i][2])))){
                return true;   
            }
        }
        return false;
    }
    public boolean checkColumns(){
        for(int i = 0; i < 3; i++){
            if((thePelennor[0][i].equals(thePelennor[1][i])&&(thePelennor[0][i].equals(thePelennor[2][i])))){
                return true;   
            }
        }
        return false;
    }
    public boolean checkTie(){
        int count = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(thePelennor[i][j].equals("O") || thePelennor[i][j].equals("X")){
                    count ++;
                }
            }
        }
        if(count == 9){
            return true;
        } else {
            return false;
        }
    }
    public boolean checkDiagonalsOfGondor(){
        if((thePelennor[0][0].equals(thePelennor[1][1])&&(thePelennor[0][0].equals(thePelennor[2][2])))){
                return true;   
            }
        if((thePelennor[0][2].equals(thePelennor[1][1])&&(thePelennor[0][2].equals(thePelennor[2][0])))){
                return true;   
            }
        return false;
    }
    public boolean isThereAVictor(){
        if(checkDiagonalsOfGondor() == true || checkColumns() == true || checkRows() == true){
            return true;
        }
        return false;
    }
    public String toString(){
        String boi = "";
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                boi += thePelennor[i][j] + " ";
            }
            boi += "\n";
        }
        return boi;
    }
}
