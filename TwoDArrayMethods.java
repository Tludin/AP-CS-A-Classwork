/**
* Classwork #1: Define the methods for problems #1-9
*/
public class TwoDArrayMethods
{

    public static void main(String[] args)
    {
        int[][] board = {{2, 4, 6, 8},
                         {1, 2, 7, 9},
                         {4, 6, 1, 10},
                         {1, 3, 11, 2}};
    printMatrix(board);
    findTotal(board);
    findMax(board);
    sumRows(board);
    sumColumns(board);
    largestinRows(board);
    largestinColumns(board);
    System.out.println(isSquare(board));
    System.out.println(isRowMagic(board));
    System.out.println(isColumnMagic(board));
    }
    // Decaling a 2D array in one line of code, to be used for testing
    
    // These are the method calls for the static methods you will define
   /* #1 Write a method for printing the elements in an array. Each row should
      * be on its own line, so that the 2D array prints as a matrix of data

        */
    public static void printMatrix(int[][] matrix)
    {
        for(int i  = 0; i < matrix.length; i++){
            for(int  p = 0; p < matrix[0].length; p++){
                System.out.print(matrix[i][p]);
            }
            System.out.println();
        }
    }
    /*
       * #2 Write a method to print the sum of all elements in the array. The
         * The output should read:
           * &quot;The sum of all elements in the array is 77
             */
    public static void findTotal(int[][] matrix)
    {
        int sumBoidy = 0;
        for(int i  = 0; i < matrix.length; i++){
            for(int  p = 0; p < matrix[0].length; p++){
                sumBoidy += matrix[i][p];
            }
        }
        System.out.println("The sum is: " + sumBoidy);
    }
    /*
       * #3 Write a method that prints the maximum value in the entire 2D array.
         * For example, this method call in our main method on page 1 should read:
           * &quot;The maximum value in the entire matrix is 11
             */
    public static void findMax(int[][] matrix)
    {
        int max = matrix[0][0];
        for(int i  = 0; i < matrix.length; i++){
            for(int  p = 0; p < matrix[0].length; p++){
                if(matrix[i][p] > max){
                    matrix[i][p] = max;
                }
            }
        }
        System.out.println("The max is" + max);
    }

    /* #4 Write a method for printing the sum of each row in the array

       * For example, this method call in our main method should output:
         * &quot;The sum of the elements in row 0 is 20.&quot;
           * &quot;The sum of the elements in row 1 is 19.&quot; etc.
             */
            public static void sumRows(int[][] matrix)
            {
            for(int i  = 0; i < matrix.length; i++){
                int rowSum = 0;
                for(int  p = 0; p < matrix[0].length; p++){
                    rowSum += matrix[i][p];
                }
                System.out.println("the sum of row " + i + " is " + rowSum); 
            }
            }

    /* #5 Write a method for finding the sum of each column in the array
               * For example, this method call in our main method should output:
                 * &quot;The sum of the elements in column 0 is 8&quot;
                   * &quot;The sum of the elements in column 1 is 15&quot; etc.
                     */
                    public static void sumColumns(int[][] matrix)
                    {
            for(int p  = 0; p < matrix[0].length; p++){
                int colSum = 0;
                for(int  i = 0; i < matrix.length; i++){
                    colSum += matrix[i][p];
                }
                System.out.println("the sum of column " + p + " is " + colSum); 
            }
                    }

/* #6 Write a method for printing the largest value in each row.
* For example, this method call in our main method should output:

* &quot;The largest value in row 0 is 8&quot; etc.
* &quot;The largest value in row 1 is 9&quot; etc.
*/
public static void largestinRows(int[][] matrix)
{
    for(int i  = 0; i < matrix.length; i++){
                int rowMax = matrix[i][0];
                for(int  p = 0; p < matrix[0].length; p++){
                    if(rowMax < matrix[i][p]){
                        rowMax = matrix[i][p];
                    }
                }
                System.out.println("the maxm of row " + i + " is " + rowMax); 
            }
}
/* #7 Write a method for printing the largest value in each column.
* For example, this method call in our main method should output:
* &quot;The largest value in column 0 is 4&quot; etc.
* &quot;The largest value in column 1 is 6&quot; etc.
*/
public static void largestinColumns(int[][] matrix)
{
for(int p  = 0; p < matrix[0].length; p++){
                int colMax = matrix[0][p];
                for(int  i = 0; i < matrix.length; i++){
                    if(colMax < matrix[i][p]){
                        colMax = matrix[i][p];
                    }
                }
                System.out.println("the max of column " + p + " is " + colMax); 
            }
}

/*
* #8 Write a method that checks if the array is a square matrix

* A square matrix has the same number of rows and columns!
*/
public static boolean isSquare(int[][] matrix)
{
if(matrix[0].length == matrix.length){
    return true;
}
return false;
}
/*
* #9 Write a method that checks if the array is &quot;row-magic&quot;, which means
* that every row has the same row sum. You will need to change the values of
* the test array in the main method to do this.
*/
public static boolean isRowMagic(int[][] matrix)
{
    int rowSum = 0;
    int i = 0;
    for(int  p = 0; p < matrix[0].length; p++){
            rowSum += matrix[i][p];
    }
    int rowPrevSum = rowSum;
    boolean magic = true;
    for(i  = 0; i < matrix.length; i++){
        rowSum = 0;
        for(int  p = 0; p < matrix[0].length; p++){
            rowSum += matrix[i][p];
        }
        if((rowSum == rowPrevSum)&&(magic == true)){
            magic = true;
        }else{
            magic = false;
        }
        rowPrevSum = rowSum;
    }
    return magic;
}
    /*
       * #9 Write a method that checks if the array is &quot;column-magic&quot;, which means
         * that every column has the same sum. You will need to change the values of
           * the test array in the main method to do this.
             */
    public static boolean isColumnMagic(int[][] matrix)
    {
        int colSum = 0;
        int p = 0;
    for(int  i = 0; i < matrix[0].length; i++){
            colSum += matrix[i][p];
    }
    int colPrevSum = colSum;
    boolean magic = true;
    for(p  = 0; p < matrix[0].length; p++){
        colSum = 0;
        for(int  i = 0; i < matrix.length; i++){
            colSum += matrix[i][p];
        }
        if((colSum == colPrevSum)&&(magic == true)){
            magic = true;
        }else{
            magic = false;
        }
        colPrevSum = colSum;
    }
    return magic;
    }
/*
* EXTENSION METHOD:

* #11 Write a method to determine if the array is a magic square, which
* means its row sums are equal, its column sums are equal, AND the sum of
* its diagonals are equal. You could use the methods above as &quot;helper&quot;
* methods!
*/
public static boolean isMagic(int[][] matrix)
{
    if((isSquare(matrix) == true)&&(isRowMagic(matrix)==true)&&(isColumnMagic(matrix)==true)){
    int diagOne = 0;
    int diagTwo = 0;
    for(int i = 0; i < matrix.length; i++){
        diagOne += matrix[i][i];
        diagTwo += matrix[i][matrix.length-(i+1)];
    }
    if(diagOne == diagTwo){
        return true;
    }
   }
   return false;
}
/*
* EXTENSION METHOD:
* #12 Write a method that checks to see if the array is a Latin square.
* A Latin square has the same # of rows and columns, which must contain
* the same values 1, 2, ..., n with no repeats. Examples:
* 123
* 123
* 123
*
* 56
* 56
*/
public static boolean isLatin(int[][] a)
{
 return false;
}
}
