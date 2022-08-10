package Week3_2;
import java.util.Scanner;

public class Week3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Initialize Scanner object.
        int num1,num2;                          // Int variables used for summation.
        String check;                           // String variable used for store text string.

        /* +++++++++++++++ Summation of two integer numbers +++++++++++++++ */
        do {
            /* Take text inputs from console and parse into integer. */
            System.out.print("Enter num1: ");
            num1 = sc.nextInt();
            System.out.print("Enter num2: ");
            num2 = sc.nextInt();

            /* Print summation of num1 & num2. */
            System.out.println("Summation is "+(num1+num2));
            
            System.out.print("Do you want to do it again?: ");
            check = sc.next();          // Receive text input and parse into String.
        }   
        while (check.equalsIgnoreCase("Yes"));
        /* Check Text input that is it equal to "Yes" ignoring case.
            o If check is "Yes" or "yes", let do statements in do-while again.
            o If not, exit from do-while loop.                                  */
        sc.close();
    }
}
