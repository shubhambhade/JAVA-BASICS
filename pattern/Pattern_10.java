/*
1
A B
1 2 3
A B C D
1 2 3 4 5
 */
package pattern.printing;
import java.util.Scanner;
public class Pattern_10 {
    int n;
    Scanner sc = new Scanner(System.in);
    void number_Character_Triangle()
    {
        System.out.println("Enter number of rows : ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            int a = 1;
            for(int j = 1; j <= i; j++)
            {
                if(a >= 65 )
                {
                    a = a + 64;
                    char ch = (char)a;
                    System.out.print(ch+" ");
                    a++;
                }
                else
                {
                    System.out.print(j+" ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Pattern_10 object = new Pattern_10();
        object.number_Character_Triangle();
    }
}
