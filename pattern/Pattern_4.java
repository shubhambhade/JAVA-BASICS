/*
print the pattern
*
* *
* * *
* * * *
* * * * *
 */
package pattern.printing;
import java.util.Scanner;
public class Pattern_4 {
    void pattern()
    {
        Scanner sc = new Scanner(System.in);
        byte number;
        System.out.println("Enter number : ");
        number = sc.nextByte();
        for(byte i = 1; i <= number; i++)
        {
            for(byte j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        Pattern_4 object = new Pattern_4();
        object.pattern();
    }
}
