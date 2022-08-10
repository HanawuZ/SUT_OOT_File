package Lab1_2;
import java.util.Scanner;
public class EquilateralTriangleDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a1: ");
        int a1 = sc.nextInt();
        System.out.print("a2: ");
        int a2 = sc.nextInt();
        double area = (Math.sqrt(3)/4)*(Math.pow(a1, 2) - Math.pow(a2, 2));
        System.out.printf("area: %f",area);
        sc.close();
    }
}
