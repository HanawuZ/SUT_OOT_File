package Loop.WhileLoop;

public class WhileLoop_Demo1 {
    /*  ++++++++++++++++++++++ While Loop ++++++++++++++++++++++
        o While loop เป็นลูปที่โปรแกรมในลูปจะทำงานก็ต่อเมื่อ 'เงื่อนไขที่กำหนดเป็นจริง'
        Syntax :
        +---------------------------+  
        |   while (Condition){      |
        |       Statement;          |
        |   }                       |
        +---------------------------+
    */
    public static void main(String[] args) {
        //*==================================================================
        int index = 0;                              // ประกาศตัวแปร index กำหนดค่าเป็น 0
        int[] int_arr = {1,3,5,7,9,11};             // ประกาศอาเรย์ 1 มิติประเภทข้อมูลเป็นจำนวนเต็ม

        /* o สร้าง while loop เพื่อวนรอบเข้าถึงสมาชิกทุกตัวในอาเรย์ int_arr โดย
             กำหนดเงื่อนไขว่า "index < int_arr.length"
             (ค่าของ index น้อยกว่าขนาดของอาเรย์ int_arr)                   */
        while (index < int_arr.length){
            System.out.println(int_arr[index]);     // แสดงค่าของสมาชิกตำแหน่งที่ index ใน int_arr
            index++;                                // Increment; เพิ่มค่าของ index 1 ค่า
        }
        //*==================================================================
        /*  ++++++++++++++++ Compare with Python ++++++++++++++++ 
            |   index = 0                                       |
            |   int_arr = [1,3,5,7,9,11]                        |
            |   while(index < len(int_arr)):                    |
            |       print(int_arr[index])                       |
            |       index+=1                                    |
            +++++++++++++++++++++++++++++++++++++++++++++++++++++
        */
    }
}

