package Loop.DoWhile;

public class DoWhile_Demo1 {
    /*  ++++++++++++++++++++++ Do While Loop ++++++++++++++++++++++
        Syntax :
        +---------------------------+
        |   do {                    |
        |       Statement;          |
        |   }                       |
        |   while(Condition);       |
        +---------------------------+
    */
    public static void main(String[] args) {
        int index = 0;  
        char[] vowel = {'a','e','i','o','u'};
        do {
            System.out.println(vowel[index]);
            index++;
        }
        while(index < vowel.length);

        /*  ++++++++++++++ Compare with Python ++++++++++++++ 
         *   o Python ไม่มี syntax do-while loop, แซด...      */
    }
}
