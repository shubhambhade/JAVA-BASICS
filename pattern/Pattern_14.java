/*
12345678
1      8
1      8
1      8
12345678
 */
package pattern.printing;
import java.util.*;
public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r , c, i , j;
        System.out.println("Enter No of rows : ");
        r = sc.nextInt();
        System.out.println("Enter No of columns : ");
        c = sc.nextInt();

        for( i = 1; i <= r; i++)
        {
            for( j = 1; j <= c; j++)
            {
                if( i == 1 || i == r || j == 1 || j == c)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
