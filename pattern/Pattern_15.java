/*
1 2 1 2 1 2
2 1 2 1 2 1
1 2 1 2 1 2
2 1 2 1 2 1
 */
package pattern.printing;

import java.util.Scanner;

public class Pattern_15 {
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
                if((i + j)%2 == 0)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(2+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
