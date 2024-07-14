/*
1
1 2
1 2 3
1 2 3 4
 */
package pattern.printing;
import java.util.Scanner;
public class Pattern_6 {
    void number_Triangle(){
        Scanner sc = new Scanner(System.in);
        byte num;
        System.out.println("Enter number : ");
        num = sc.nextByte();
        for(byte i = 1; i <= num; i++ )
        {
            for(byte j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Pattern_6 object = new Pattern_6();
        object.number_Triangle();
    }
}
