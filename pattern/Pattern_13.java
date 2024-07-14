/*
1234567
2345671
3456712
4567123
5671234
6712345
7123456
 */
package pattern.printing;
import java.util.*;
public class Pattern_13 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int r ,i ,j , k;
        System.out.println("Enter row number : ");
        r = sc.nextInt();

        for( i = 1; i <= r; i++)
        {
            for( j = i; j <= r; j++)
            {
                System.out.print(j);
            }
            for( k = 1; k <= i-1; k++)
            {
                System.out.print(k);
            }
            System.out.print("\n");
        }
    }
}
