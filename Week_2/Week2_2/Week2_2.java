package Week_2.Week2_2;
import java.util.Scanner;
public class Week2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // Declare Scanner object for receive keyboard input.
        System.out.print("Input your budget: ");        
        int budget = sc.nextInt();                          // Receiving int value from keyboard and assign it to variable "budget".

        if (budget <= 500) System.out.print("Keyboard");
        else if (budget <= 1000) System.out.print("Mouse");
        else if (budget <= 2000) System.out.print("Router");
        else if (budget <= 10000) System.out.print("Monitor");
        else System.out.print("Graphic Card");           // Close Scanner object
        sc.close();
    }
}
