package problem;
import java.util.Scanner;

public class Problem_8 {
    Scanner sc = new Scanner(System.in);
    /*
    create an array 5 floats and calculate their sum.
     */
    void sum_Of_Array()
    {
        System.out.println("Enter floating number into array : ");
        float[] addition = new float[5];
        float sum = 0 ;
        for (int i=0; i< addition.length; i++)
        {
            addition[i] = sc.nextFloat();
        }
        for (float i : addition)
        {
            System.out.print(i+" ");
            sum = sum + i;
            sum++;
        }
        System.out.println("\nSum : "+sum);
    }

    void check_number_present_or_not()
    {
        int[] roll_no = {1,2,3,4,5};
        for (int i : roll_no)
        {
            System.out.print(i+" ");
        }
        int num;
        System.out.print("\nEnter element and check the its present or not in array : ");
        num = sc.nextInt();
        boolean isInArray = false;
        for (int i : roll_no)
        {
            if(num == i)
            {
                isInArray = true;
                break;
            }
        }
        System.out.print("\n");
        if (isInArray)
        {
            System.out.println("number is in array");
        }
        else
        {
            System.out.println("number is not in array");
        }
    }
    public static void main(String[] args)
    {
        Problem_8 obj = new Problem_8();
//        obj.sum_Of_Array();
        obj.check_number_present_or_not();
    }
}
