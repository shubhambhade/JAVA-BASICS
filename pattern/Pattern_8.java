/*
print odd number triangle
1
1 3
1 3 5
1 3 5 7
 */
package pattern.printing;
import java.util.Scanner;

public class Pattern_8 {
    void odd_Number_Triangle()
    {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter Number of rows : ");
        number = sc.nextInt();
        for(int i = 1; i <= number; i++)
        {
            int a = 1;
            for(int j = 1; j <= i; j++)
            {
                System.out.print(a+" ");
                a = a+ 2;
            }
            System.out.print("\n");
        }
    }
    /*
1 3 5 7 9
1 3 5 7 9
1 3 5 7 9
1 3 5 7 9
1 3 5 7 9
     */
    void odd_Number_Square(){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter Number of rows : ");
        number = sc.nextInt();
        for(int i = 1; i <= number; i++)
        {
            for(int j = 1; j <= 2*number-1; j = j + 2)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        Pattern_8 object = new Pattern_8();
        object.odd_Number_Triangle();
        object.odd_Number_Square();
    }
}
