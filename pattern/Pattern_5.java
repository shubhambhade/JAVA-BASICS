/*
print the pattern
* * * *
* * *
* *
*

 */
package pattern.printing;
import java.util.Scanner;
public class Pattern_5 {
    void reverse_triangle(){
        Scanner sc = new Scanner(System.in);
        byte n;
        System.out.println("Enter value of n : ");
        n = sc.nextByte();

//        for (int i = n; i > 0; i--)
//        {
//            for(int j = 0; j < i; j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
        for(byte i = 1; i <= n; i++)
        {
            for(byte j = 1; j <= n+1-i; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Pattern_5 object = new Pattern_5();
        object.reverse_triangle();
    }
}

