package Week_2.Week2_4;
import java.util.Scanner;
public class Week2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Initialize Scanner object
        /* Receive number 1 from keyboard input */
        System.out.print("Enter num1: ");         
        int num1 = sc.nextInt();

        /* Receive number 2 from keyboard input */
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        /* Receive operator character from keyboard input 
            o Use method next() for receiving String value ("+" , "-" , "*" , "/")
            o Use method charAt() to parse String to character ('+' , '-' , '*' ,'/')
        */
        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);              // ใช้เมธอด charAt ระบุอักขระตำแหน่งที่ 0 แล้วเก็บไว้ในตัวแปร op
        
        /* +++++++++++ Switch case for choosing operation +++++++++++ */
        switch (op) {
            /* If character op is '+', let do addition between number 1 and number 2 */
            case '+':
                System.out.format("%d+%d = %d",num1,num2,num1+num2);
                break;
            
            /* If character op is '-', let do subtraction between number 1 and number 2 */
            case '-':
                System.out.format("%d-%d = %d",num1,num2,num1-num2);
                break;
            
            /* If character op is '-', let do multiply between number 1 and number 2 */
            case '*':
                System.out.format("%d*%d = %d",num1,num2,num1*num2);
                break;
            
            /* If character op is '-', let do division between number 1 and number 2 */
            case '/':
                // Parsing both number 1 and number 2 to Double type to avoid wrong answer
                System.out.format("%d/%d = %f",num1,num2,(double)num1/(double)num2);
                break;
        }
        sc.close();             // Close Scanner object
    }
}
