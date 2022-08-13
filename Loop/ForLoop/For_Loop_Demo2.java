package Loop.ForLoop;
import java.util.Scanner;

/* Summation program */
public class For_Loop_Demo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1 ; i <= num ; i++){
            sum += Math.pow(i,2);       //* sum = sum + i^2
        }
        System.out.format("Series Summation is %d",sum);
        in.close();

        /*  +++++++++++++++++++ Compare with Python +++++++++++++++++++
            |   num = int(input('Enter a number: '))                  |
            |   sum = 0                                               |
            |   for i in range(1,num+1):                              |
            |       sum+=i**2                                         |
            |   print('Summation is %d' %sum)                         |
            +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        */
    }
}
