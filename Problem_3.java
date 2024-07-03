
/*
use comparison operator to find out whether a given number
is greater than the user entered number or not.
 */
package problem;
import java.util.*;
public class Problem_3 {
    void check_Number_Is_Greater_Or_Not()
    {
        int number;
        int given_number=34;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        number = sc.nextInt();
        if(number>given_number)
        {
            System.out.println("User entered input number is greater");
            System.out.println("Given number :"+given_number);
        }
        else {
            System.out.println("User entered input number is not greater");
            System.out.println("Given number :"+given_number);
        }
    }
    public static void main(String[] args)
    {
        Problem_3 object = new Problem_3();
        object.check_Number_Is_Greater_Or_Not();
    }
}
