package Loop.ForLoop;

public class For_Each_Loop {
    /*  ++++++++++++++++++ For Each loop ++++++++++++++++++ 
        o For Each loop เป็นลูป for ที่ใช้ตัวแปร ในการท่องเข้าไปในอาเรย์เพื่อเข้าถึงสมาชิกทุกตัวในนั้น
        Syntax :
        +-------------------------------------------+
        |   for (dataType variable : array_name){   |
        |       Statement;                          |
        |   }                                       |
        +-------------------------------------------+        
        
        Explaination :
         [1] dataType : กำหนดประเภทตัวแปร โดยจะต้องเป็นประเภทเดียวกันกับประเภทข้อมูลของสมาชิกในอาเรย์
         [2] variable : ชื่อตัวแปรที่ใช้ในลูป
         [3] array_name : ระบุชื่ออาเรย์ที่จะนำมาท่อง
    */
    public static void main(String[] args) {
        // ==================================================================
        /* ประกาศอาเรย์ที่เก็บข้อมูล String ชื่อ animal_arr */
        String[] animal_arr = {"Cat" , "Dog" , "Fish" , "Bird"};
        
        /*  สร้าง for each loop เพื่อเข้าถึงสมาชิกทุกตัวในอาเรย์ animal_arr 
            โดย ประกาศตัวแปร String ชื่อ animal ไว้ใช้แทนข้อมูลสมาชิกในอาเรย์นั้น  */
        for (String animal : animal_arr){
            System.out.println(animal);
        }
        // ==================================================================
        /*  ++++++++++++++++ Compare with Python ++++++++++++++++ 
            +---------------------------------------------------+
            |   animal_arr = ['Cat' , 'Dog' , 'Fish' , 'Bird']  |
            |   for animal in animal_arr:                       |
            |       print(animal)                               |
            +---------------------------------------------------+
        */
    }
}
