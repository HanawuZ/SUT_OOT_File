package Week3_3;
import java.util.Scanner;
public class Week3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        // Initialize object scanner class.

        /* Tell user for integer input */
        System.out.print("Enter num: "); 
        int n = input.nextInt();            // Receive text input and parse into integer.
        int fac = 1;                        // Int variable for result of factorial.
        int i;                              // Int variable for loop.

        /*  +++++++++++++++ Factorial Calculation +++++++++++++++ 
            o Loop for start at i = 1 , incresing i by 1.
            o Multiple fac variable with i.                         */
        for (i=1 ; i<=n ; i++){ fac*=i; }
        System.out.print("Factorial value of "+n+" is "+fac);
        input.close();                      // Close input object by using method close().
    }
}
