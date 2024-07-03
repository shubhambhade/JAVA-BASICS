/*
write program is calculate percentage of state board mark.
 */
package problem;
import java.util.*;

public class CalculatePercentage {
    void enterSubjectMark(){
        float sub1,sub2,sub3,sub4,sub5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark english : ");
        sub1 = sc.nextFloat();
        System.out.println("Enter mark marathi : ");
        sub2 = sc.nextFloat();
        System.out.println("Enter mark hindi : ");
        sub3 = sc.nextFloat();
        System.out.println("Enter mark history : ");
        sub4 = sc.nextFloat();
        System.out.println("Enter mark geography : ");
        sub5 = sc.nextFloat();
        if (sub1<=100 && sub2<=100 && sub3<=100 && sub4<=100 && sub5<=100)
        {
            float percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
            System.out.println("Total Percentage of Board Exam :" + percentage);
        }
        else
        {
            System.out.println("You can enter  the mark less than equal to 100 for each subject because every subject highest mark is out-off 100");
        }
    }
    public static void main(String [] args)
    {
        CalculatePercentage object = new CalculatePercentage();
        object.enterSubjectMark();
    }
}

