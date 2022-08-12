package Week_2.Week2_1;
import java.util.Scanner;
public class Week2_1 {
    /* ++++++++++++ Function main ++++++++++++ */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // Declare Scanner object for receive keyboard input
        int price;                                      // Int variable for storing budget value
        System.out.print("Input your budget: ");     
        price = sc.nextInt();                           // Use nextInt() method for receiving int value

        /*  if price value is more than 15000 then print "You can buy it"
            but else then print "Nope!!"                                    */ 
        if (price>15000) System.out.println("You can buy it");
        else System.out.println("Nope!");
        sc.close();                                     // Close Scanner object
    }
}
