package Week3_3;
import java.util.Scanner;
public class Week3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt() , fac=1 , i;
        for (i=1 ; i<=n ; i++){
            fac*=i;
        }
        System.out.print("Factorial value of "+n+" is "+fac);
        sc.close();
    }
}
