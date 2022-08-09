package Week3_5;
public class Week3_5 {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},
                       {40,50,60},
                       {70,80,90}};
        int row,column,sum=0;
        for (row = 0 ; row<arr.length ; row++){
            for (column = 0 ; column<arr[row].length; column++){
                sum+=arr[row][column];
            }
            System.out.println("Summation of row "+row+" is "+sum);
            sum=0;
        }
    }
}
