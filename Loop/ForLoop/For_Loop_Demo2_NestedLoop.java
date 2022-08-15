package Loop.ForLoop;

public class For_Loop_Demo2_NestedLoop {
    /*  ++++++++++++++++++++++++ Nested For loop ++++++++++++++++++++++++
        Syntax :
        +-------------------------------------------------------------------+
        | for (Initialization1 ; Condition ; Increment/Decrement){          |
        |      for (Initialization2 ; Condition ; Increment/Decrement){     |
        |            Statement;                                             |
        |      }                                                            |
        | }                                                                 |
        +-------------------------------------------------------------------+   */  
    public static void main(String[] args) {
        //*==================================================================
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        /*  หรือจะประกาศอาเรย์แบบนี้ก็ได้
            int arr[][] = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};    */
        
        // สร้าง Nested for loop เพื่อแสดงสมาชิกในอาเรย์ 2 มิติ arr ในแบบ matrix */
        // For loop สำหรับวนเพื่อเข้าถึงอาเรย์ย่อย (เป็นแถว)
        for (int row = 0 ; row < 3 ; row++){

            // For loop สำหรับวนเพื่อเข้าถึงสมาชิกในอาเรย์ย่อย
            for (int column = 0 ; column < 3 ; column++){
                System.out.format("%d ",arr[row][column]);
            }       
            System.out.println();       // เมื่อจบ For loop column แล้ว ให้ทำการเว้นบรรทัด
        }           

        //*==================================================================
        /*  +++++++++++++++++++ Compare with Python +++++++++++++++++++
            |    arr = [[1,2,3],                                      |
            |           [4,5,6],                                      |
            |           [7,8,9]]                                      |
            |    for row in range(0,3):                               |
            |        for column in range(0,3):                        |
            |            print("%d "%arr[row][column],end="")         |   
            |        print()                                          |
            +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        */
    }
}