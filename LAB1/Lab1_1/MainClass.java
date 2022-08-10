package Lab1_1;
import java.util.Scanner;   
class MainClass {
    public static void main(String[] args) {
        /*  +++++++++++++++++++++ Scanner Object Initialization +++++++++++++++++++++
            o Syntax :
            +------------------------------------------+
            |   Scanner sc = new Scanner(System.in);   | 
            +------------------------------------------+
            -   Initialize Scanner class object
            -   This statement will call constructor of Scanner class, 
                then pass argument System.in. 
                It means read from the standard input stream of the program

            -   สร้าง object คลาส Scanner ชื่อ sc 
            -   โค๊ดจะเรียกใช้ ตัวสร้าง(Constructor) ของคลาส Scanner โดยส่ง parameter System.in
                เป็นคีย์เวิร์ดที่จะทำให้เราสามารถรับค่า input ได้
            +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    */
        Scanner sc = new Scanner(System.in);   
        
        /* Take text inputs from console and parse into interger using method nextInt(). */
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();

        /*  +++++++++++++++++++++ Factorisation +++++++++++++++++++++   
            o Find factors of equation 'ax^2 + bx + c' by using formula     */
        double x1 = (-b + Math.sqrt( Math.pow(b,2)-(4*a*c) ))/(2*a);
        double x2 = (-b - Math.sqrt( Math.pow(b,2)-(4*a*c) ))/(2*a);

        /* Print factors. */
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);

        sc.close();
    }
}
