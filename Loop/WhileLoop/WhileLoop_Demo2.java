package Loop.WhileLoop;
import java.util.Scanner;
public class WhileLoop_Demo2 {
    public static void main(String[] args) {
        //*=====================================================================
        Scanner in = new Scanner(System.in);
        int sum = 0;            // ตัวแปร int เก็บผลลัพธ์การบวก
        int count = 1;          // ตัวแปร int นับจำนวนตัวเลขที่ใส่เข้าไป
        while(true){
            System.out.format("Enter number %d: ",count);
            int num = in.nextInt();

            // ถ้า num < 0 ให้หยุดทำงานโปรแกรมในลูป while ทันที
            if (num < 0) {
                break;
            }
            sum+=num;           // นำตัวเลขที่ใส่เข้ามาไปบวกกับ sum
            count++;            // เพิ่มค่า count 1 ค่า
        }
        System.out.format("Summation is %d",sum);
        in.close();
        //*=====================================================================
    }
    /*  ++++++++++++++++++++ Compare with Python ++++++++++++++++++++
        |   sum = 0                                                 |
        |   count = 1                                               |
        |   while(True):                                            |
        |       num = int(input('Enter number %d: '%count))         |
        |       if (num < 0):                                       |
        |           break                                           |
        |       sum+=num                                            |
        |       count+=1                                            |
        |   print('Summation is %d'%sum)                            |
        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
     
    */
}
