/*  +------------------------------------------------------------+
    | Problem : Create a summation of positive integer numbers   | 
    |    o Program always receive integer input.                 |
    |    o Program stop summation of integer input is negative.  |
    +------------------------------------------------------------+
*/

package Week3_1;
import java.util.Scanner;
public class Week3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,sum=0;                                  

        /* ++++++++++++ Summation of positive integer numbers ++++++++++++ 
         * o We can implement summation using while loop in 2 ways
         *   (1) Receive first number and then start while loop for receiving next numbers
         *       until user input negative number to break a loop.
         *   (2) Using do-while loop for receiving numbers. Break the loop
         *       if user send a negative number.
        */

       
        do {
            /* Receive int number from keyboard input. */ 
            System.out.print("Input number: ");     
            num = sc.nextInt();
            
            /* If input number is postive then do summation. */
            if (num >= 0) sum+=num;
        }
        while (num >= 0);
        


        // System.out.print("Input number: ");
        // num = sc.nextInt();
        // while (num>=0) {
        //     sum+=num;
        //     System.out.print("Input number: ");
        //     num = sc.nextInt();
        // }
        System.out.print("Summation: "+sum);
        sc.close();
    }
}
