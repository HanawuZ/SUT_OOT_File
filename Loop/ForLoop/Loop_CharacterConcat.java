package Loop.ForLoop;
import java.util.Scanner;
public class Loop_CharacterConcat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "";
        String character;
        int count = 1;
        System.out.print("Enter a string length: ");
        int length = input.nextInt();
        while (count <= length){
            System.out.printf("Enter character %d: ",count);
            character = input.next();
            text = text+character;
            count++;
        }
        System.out.println(text);
        input.close();
    }   
}
