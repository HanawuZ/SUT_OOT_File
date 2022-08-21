/*
+ ==================================================================== +
 PROBLEM :
 o  จงเขียนโปรแกรมเพื่อแสดงรูปทรงดังตัวอย่าง
    Output 1:
        Input number of rows : 5
        -
        +-
        -+-
        +-+-
        -+-+-
    
    -------------------------------------------------------------

    Output 2:
        Input number of rows : 4
        -
        +-
        -+-
        +-+-
+ ==================================================================== +
*/

package Loop.ForLoop;
import java.util.Scanner;
public class PRACTICE2_Loop {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int size,row,column;
        char p,q;

        // รับ input เป็นจำนวนแถว
        System.out.print("Input number of rows : ");
        size = Input.nextInt();

        // Loop for วนรอบแถว
        for (row = 1 ; row <= size ; row++){
            if (row %2 == 0){
                p = '-'; q = '+';
            }
            else {
                p = '+'; q = '-';
            }

            // Loop for วนคอลัมน์ จำนวนคอลัมน์ตามจำนวนแถว ณ แถวนั้น
            for (column = 1 ; column <= row ; column++){
                if (column%2 == 0){
                    System.out.print(p);
                }
                else {
                    System.out.print(q);
                }
            }
            System.out.println();
        }
        Input.close();
    }
}
