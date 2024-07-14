/*
1 2 3 4
1 2 3
1 2
1
 */
package pattern.printing;
import java.util.Scanner;
public class Pattern_7 {
    void reverse_Number_Triangle()
    {
        Scanner sc = new Scanner(System.in);
        byte n;
        System.out.println("Enter number : ");
        n = sc.nextByte();
        for(byte i = n ; i > 0; i-- )
        {
            for(byte j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Pattern_7 object = new Pattern_7();
        object.reverse_Number_Triangle();
    }
}
