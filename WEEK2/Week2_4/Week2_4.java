package Week2_4;
import java.util.Scanner;
public class Week2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
            System.out.format("%d+%d = %d",num1,num2,num1+num2);
            break;
            
            case '-':
            System.out.format("%d-%d = %d",num1,num2,num1-num2);
            break;

            case '*':
            System.out.format("%d*%d = %d",num1,num2,num1*num2);
            break;
            
            case '/':
            System.out.format("%d/%d = %f",num1,num2,(double)num1/(double)num2);
            break;
        }
        sc.close();

    }
}
