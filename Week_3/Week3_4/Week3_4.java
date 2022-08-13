package Week_3.Week3_4;
import java.util.Arrays;        // Import Java Utility array class.
public class Week3_4 {
    public static void main(String[] args) {
        int[] arr = {12,17,14,15,16,89,23,1,9,100};     // Array of int initialization,
        System.out.println(Arrays.toString(arr));       // Print the array in string representation.
        Arrays.sort(arr);                               // Ascending sort int values in array.

        /* Print 2nd largest number in the array. Its position is at 'last index - 1'. */
        System.out.print("The second largest number is "+arr[arr.length-2]);
    }
}
