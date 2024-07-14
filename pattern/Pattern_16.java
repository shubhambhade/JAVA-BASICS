/*
      1
     121
    12321
   1234321
  123454321
 12345654321
1234567654321
 */
package pattern.printing;
import java.util.*;
public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,i,j;
        System.out.println("Enter number of rows : ");
        r = sc.nextInt();

        for( i = 1; i <= r; i++) // traversing over row
        {
            //print r - i spaces

            for(j=1; j<= r -i; j++)
            {
                System.out.print(" ");
            }
            // print 1 to i
            for(int k = 1; k <= i; k++ )
            {
                System.out.print(k);
            }
            // print i-1 to 1
            for ( int l = i -1 ; l >= 1; l--)
            {
                System.out.print(l);
            }

            System.out.print("\n");
        }
    }
}
