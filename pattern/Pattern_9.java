/*
A B C D
A B C D
A B C D
A B C D
 */
package pattern.printing;
import java.util.Scanner;

public class Pattern_9 {
    int n;
    Scanner sc = new Scanner(System.in);
    void character_Square(){
        System.out.println("Enter number of rows : ");
        n = sc.nextInt();
       for(int i = 1; i <= n; i++ )
       {
           int a = 1;
           for(int j = 1; j <= n; j++)
           {
               int d = a + 64;
               char ch = (char) d;
               System.out.print(ch+" ");
               a++;
           }
           System.out.print("\n");
       }
    }
    /*
A
A B
A B C
A B C D
A B C D E
     */
    void character_Triangle(){
        for(int i = 1; i <= n; i++ )
        {
            int a = 1;
            for(int j = 1; j <= i; j++)
            {
                int d = a + 64;
                char ch = (char) d;
                System.out.print(ch+" ");
                a++;
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        Pattern_9 object = new Pattern_9();
        object.character_Square();
        object.character_Triangle();
    }
}
