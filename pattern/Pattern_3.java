/*
print the given pattern
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
 */
package pattern.printing;
import java.util.Scanner;

public class Pattern_3 {
    void number_pattern(){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter number : ");
        number = sc.nextInt();
        for(int i = 0 ; i < number; i++)
        {
            for(int j = 1; j <= number; j++)
            {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        Pattern_3 object = new Pattern_3();
        object.number_pattern();
    }
}
