
/**
 * Write a description of class detectTumor here.
 *
 * @author Tomas Ludin The |Magnificent|
 * @version 0.1.0
 */
public class TumorDetector
{
    public static String detectTumor(int[][] patient, int[][] tumor){
        String analysis = "Possible tumors at ";
        for(int i = 0; i < (patient.length - tumor.length + 1); i++){
            //System.out.println("Check");
            for(int j = 0; j < (patient[0].length - tumor[0].length + 1); j++){
                //System.out.println("Check II");
                int[][] scan = new int[tumor.length][tumor.length];
                for(int q = 0; q < (tumor.length); q++){
                    for(int p = 0; p < (tumor[0].length); p++){
                        scan[p][q] = patient[p+j][q+i];
                    }
                }
                if(arrayEquals(scan, tumor) == true){
                    analysis += "(" + i+ "," + j + ", 0) ";
                }
                if(arrayEquals(rotateArray(scan), tumor) == true){
                    analysis += "(" + i+ "," + j + ", 90) ";
                }
                if(arrayEquals(rotateArray(rotateArray(scan)), tumor) == true){
                    analysis += "(" + i+ "," + j + ", 180) ";
                }
                if(arrayEquals(rotateArray(rotateArray(rotateArray(scan))), tumor) == true){
                    analysis += "(" + i+ "," + j + ", 270) ";
                }
            }
        }
        return analysis;
    }
    public static boolean arrayEquals(int[][] a1, int[][] a2){
        //boolean isEquals = false;
        //if((a1.length == a2.length) && (a1[0].length == a2[0].length)&&(a1[0].length == a1.length)){
            boolean isEquals = true;
            for(int i = 0; i < a1.length; i++){
                for(int j = 0; j < a1.length; j++){
                    if(a1[i][j] != a2[i][j]){
                        isEquals = false;
                    }
                }
            }
        //}
        return isEquals;
    }
    public static int[][] rotateArray(int[][] a){
        int[][] b = new int[a.length][a.length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                b[j][a.length - i - 1] = a[i][j];
            }
        }
        return b;
    }
    public static void main(String[] args){
        int[][] joeEdmondoggScan = new int[][]{{0,0,0,0,1,1,0,0,1,1},{1,1,1,0,1,0,1,0,0,1},{0,0,1,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,1,1},{1,1,0,0,0,0,0,1,0,0},{0,1,0,1,0,0,1,1,1,1},{1,1,1,1,1,0,0,1,1,0},{0,0,0,0,0,0,0,0,0,0}
        ,{1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1}};
        int[][] joesTumor = new int[][]{{0,0,1,1},{0,0,1,0},{0,1,1,1},{0,0,1,1}};
        int[][] aTeamScan = new int[][]{{0,0,0,0,1,0},{0,0,0,0,1,1},{1,1,1,0,1,0},{0,1,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        int[][] aTeamTumor = new int[][]{{0,1,0},{0,1,1},{0,1,0}};
        for(int i = 0; i < aTeamScan.length; i++){
            for(int j = 0; j < aTeamScan[0].length; j++){
                System.out.print(aTeamScan[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < aTeamTumor.length; i++){
            for(int j = 0; j < aTeamTumor[0].length; j++){
                System.out.print(aTeamTumor[i][j]);
            }
            System.out.println();
        }
        System.out.println(detectTumor(aTeamScan, aTeamTumor));
    }
}
