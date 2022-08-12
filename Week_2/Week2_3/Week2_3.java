package Week_2.Week2_3;
import java.util.Scanner;
public class Week2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter a postive num: ");
        int num = sc.nextInt();
        if (num>=0) {
            System.out.format("Square root of %d is %f\n",num,Math.sqrt(num));
            System.out.format("Cube root of %d is %f\n",num,Math.cbrt(num));
        }
        else System.out.print("Negative number is not allowed");
        sc.close();
    }
}
