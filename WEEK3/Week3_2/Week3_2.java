package Week3_2;
import java.util.Scanner;

public class Week3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        String check;
        do {
            System.out.print("Enter num1 and num2: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Summation is "+(num1+num2));
            System.out.print("Do you want to do it again?: ");
            check = sc.next();
        }   
        while (check.equalsIgnoreCase("Yes"));
        sc.close();
    }
}
