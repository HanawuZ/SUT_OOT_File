/*  +====================================================================+
       PROBLEM : 
       o สร้าง Loop สำหรับรับ Input เป็นจำนวนเต็มจำนวนข้อมูลตามที่ผู้ใช้ระบุ 
         แล้ว assign เข้าไปในอาเรย์ แล้วแสดงอาเรย์นั้นออกทางจอภาพ โดย             
           - ถ้าจำนวนข้อมูลที่ใส่เข้ามา น้อยกว่า/เท่ากับ 0 -> ให้โปรแกรมบอกผู้ใช้ให้     
             ใส่ input เข้ามาใหม่
    +====================================================================+  */

package Loop.ForLoop;
import java.util.Scanner;
import java.util.Arrays;
public class PRACTICE1_For_Loop {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int amount;

        /* ------------ If use for loop ------------ */
        for (;;){
            System.out.print("Enter an amount of integer input(s): ");
            amount = Input.nextInt();
            if (amount <= 0) System.out.println("Try again!!");
            else break;
        }
        
        /* ------------ If use while loop ------------ */
        // while(true){
        //     System.out.print("Enter an amount of integer input(s): ");
        //     amount = Input.nextInt();
        //     if (amount <= 0) System.out.println("Try again!!");
        //     else break;
        // }

        /* ------------ If use do while loop ------------ */
        // do {
        //     System.out.print("Enter an amount of integer input(s): ");
        //     amount = Input.nextInt();
        //     if (amount <= 0) System.out.println("Try again!!");
        //     else break;
        // }
        // while(true);

        int int_arr[] = new int[amount];

        /* ------------ If use for loop ------------ */
        for (int i = 1 ; i <= amount ; i++){
             System.out.format("Enter number %d: ",i);
             int_arr[i-1] = Input.nextInt();
        }

        /* ------------ If use while loop ------------ */
        // int i = 1;
        // while(i <= amount){
        //     System.out.format("Enter number %d: ",i);
        //     int_arr[i-1] = Input.nextInt();
        //     i++;
        // } 
        
        /* ------------ If use do while loop ------------ */
        // int i = 1;
        // do{
        //     System.out.format("Enter number %d: ",i);
        //     int_arr[i-1] = Input.nextInt();
        //     i++;
        // } while(i <= amount);

        System.out.println("Array of integer(s): "+Arrays.toString(int_arr));
        Input.close();
    }
}
