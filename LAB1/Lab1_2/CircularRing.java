package Lab1_2;
import java.util.Scanner;
public class CircularRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Take outer radius value input */
        System.out.print("r1: ");
        int r1 = sc.nextInt();

        /* Take inner radius value input */
        System.out.print("r2: ");
        int r2 = sc.nextInt();

        /*  +++++++++++++++++++++ Calculate area of circular ring +++++++++++++++++++++ 
         *  o พื้นที่วงแหวนหาได้จากการนำ พื้นที่วงกลมรัศมีนอก - พื้นที่วงกลมรัศมีใน 
         *  o จากพิ้นที่วงกลม = Pi*(r^2) เราใช้ค่าคงตัว pi ได้จาก Math.PI และคำนวนค่ายกกำลังจาก
         *    ฟังก์ชัน Math.pow(เลขฐาน , เลขชี้กำลัง)
         *  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
         *  [1] เพิ่มเติมเกี่ยวกับ Math Class
         *      SOURCE : https://www.w3schools.com/java/java_math.asp                       */
         
        /* Declare double variable named "area" to store area of circular ring. */
        double area = (Math.PI)*(Math.pow(r1,2))-(Math.PI)*(Math.pow(r2,2));
        System.out.print("The area is "+area);
        sc.close();
    }
}
