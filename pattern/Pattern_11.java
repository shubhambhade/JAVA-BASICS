
/*
   ********
  *        *
  *        *
  * *******
 */
package pattern.printing;
import java.util.*;
public class Pattern_11 {
    static Scanner sc = new Scanner(System.in);
    static void border_rectangle()
    {
        int r, c , i,  j;
        System.out.println("Enter no of rows : ");
        r = sc.nextByte();
        System.out.println("Enter no of columns  : ");
        c = sc.nextByte();
        for(i=1; i<=r; i++)
        {
            for( j = 1; j <= c; j++)
            {
                if(i==1 || i == r || j == 1 || j == c)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
    public static void main(String[] args) {
        border_rectangle();
    }
}
