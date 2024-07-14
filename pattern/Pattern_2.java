/*
print square pattern
*  *  *  *
*  *  *  *
*  *  *  *
*  *  *  *

 */
package pattern.printing;
import java.util.Scanner;
public class Pattern_2 {
    void square_Pattern()
    {
        byte square_side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square : ");
        square_side = sc.nextByte();
        for (byte i = 0; i < square_side; i++ )
        {
            for (int j = 0; j <square_side; j++)
            {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
    public static  void main(String[] args)
    {
        Pattern_2 object = new Pattern_2();
        object.square_Pattern();
    }
}
