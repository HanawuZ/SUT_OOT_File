package Week3_4;
import java.util.Arrays;
public class Week3_4 {
    public static void main(String[] args) {
        int[] arr = {12,17,14,15,16,89,23,1,9,100};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.print("The second largest number is "+arr[arr.length-2]);
    }
}
