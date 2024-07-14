package pattern.printing;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r , i , j;
        System.out.println("Enter no of row : ");
        r = sc.nextInt();

        for( i = 1; i<= r; i++)
        {
            for ( j = 1; j <= r - i ; j++)
            {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
