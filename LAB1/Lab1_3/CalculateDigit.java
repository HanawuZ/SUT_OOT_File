/*
 * 
 * 
 * 
 * 
 * 
 * 
 */


package Lab1_3;
import java.util.Scanner;
public class CalculateDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a four-digit integer: ");
        int num = sc.nextInt();
        int a = num/1000; 
        int b = (num/100)%10;
        int c = (num/10)%10;
        int d = num%10;
        double result = (double)(a*d)/(double)(b+c);
        System.out.print("The result of all digit in "+num+" is "+result);
        sc.close();
    }
}
