package Week3_1;
import java.util.Scanner;
public class Week3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,sum=0;                                  // Declare two int variable
        System.out.print("Input number: ");          // Printt
        num = sc.nextInt();
        while (num>=0) {
            sum+=num;
            System.out.print("Input number: ");
            num = sc.nextInt();
        }
        System.out.print("Summation: "+sum);
        sc.close();
    }
}
