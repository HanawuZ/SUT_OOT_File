package Loop.ForLoop;

public class For_Loop_Demo2_NestedLoop {
    /*  ++++++++++++++++++ Nested For loop ++++++++++++++++++
            Syntax :
            +-------------------------------------------------------------------+
            | for (Initialization1 ; Condition ; Increment/Decrement){          |
            |      for (Initialization2 ; Condition ; Increment/Decrement){     |
            |            Statement;                                             |
            |      }                                                            |
            | }                                                                 |
            +-------------------------------------------------------------------+   */  
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        for (int row = 0 ; row < 3 ; row++){
            for (int column = 0 ; column < 3 ; column++){
                System.out.println("Number "+arr[row][column]);
            }       // ปีกกาปิดจบลูป for column
        }           // ปีกกาปิดจบลูป for row
        // ==================================================================
        /*  ++++++++++++++ Compare with Python ++++++++++++++ 
            +-----------------------------------------------+
            |    arr = [[1,2,3],                            |
            |           [4,5,6],                            |
            |           [7,8,9]]                            |
            |    for row in range(0,4):                     |
            |        for column in range(0,4):              |
            |            print("Number",arr[row][column])   |
            +-----------------------------------------------+
        */
        
    }
}
