package Week_3.Week3_5;

public class Week3_5 {
    /* ################################# Main Function ################################# */
    public static void main(String[] args) {

        /* Initialize 2D array of int with 3 rows & 3 columns. */
        int[][] arr = {{10,20,30},
                       {40,50,60},
                       {70,80,90}};
        int row;            //* Int variable for row indexs.
        int column;         //* Int variable for column indexes.
        int sum = 0;        //* Int variable for result of summation.

        /* +++++++++++++++ Summation of numbers in each row +++++++++++++++ */
        // Loop for passing rows of array.
        for (row = 0 ; row<arr.length ; row++){

            // Loop for passing columns of array at current row.
            //* Calculate summation of numbers in each row.
            for (column = 0 ; column<arr[row].length; column++){
                sum += arr[row][column];            
            }

            System.out.println("Summation of row "+row+" is "+sum);     // Print summation of current row.
            sum = 0;                                                    // Reset sum variable value to 0.
        }
    }
}
