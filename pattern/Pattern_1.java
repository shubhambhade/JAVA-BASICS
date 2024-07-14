/*
print given pattern
* * * * *
* * * * *
* * * * *
 */

package pattern.printing;
import java.util.Scanner;

public class Pattern_1 {
    void rectangle_pattern(){
        byte row , column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row : ");
        row = sc.nextByte();
        System.out.println("Enter number of column : ");
        column = sc.nextByte();
        for(int i = 0 ; i < row ; i++) // outer loop --> no. of lines (no of rows)
        {
            for(int j =0 ; j < column ; j++)  //inner loop --> no. of star in each line ( no of lines)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Pattern_1 object = new Pattern_1();
        object.rectangle_pattern();
    }
}
