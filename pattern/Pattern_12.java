/*
    *
   ***
  *****
 *******
 */
package pattern.printing;
import java.util.*;
public class Pattern_12 {
    static Scanner sc = new Scanner(System.in);
    static void  pyramid()
    {
        int r,i,j;
        System.out.println("Enter number of rows : ");
        r = sc.nextInt();

        for( i = 1; i <= r; i++) // traversing over row
        {
            //print r - i spaces
            for(j = 1; j <= r -i; j++)
            {
                System.out.print(" ");
            }

            // print 2*i-1
            for(int k = 1; k <= 2*i-1; k++ )
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        pyramid();
    }
}
