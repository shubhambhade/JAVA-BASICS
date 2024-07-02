package comp.company;
import java.util.*;

public class Conditional_statement {
    Scanner sc = new Scanner(System.in);
    //check the even and odd number.
    void if_else_condition()
    {
        int number;
        System.out.println("check the even and odd number : ");
        number = sc.nextInt();
        if(number/2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }

    //enter your age and check you can drive the car or not.
    void if_else_condition1()
    {
        int age;
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        if(age>18)
        {
            System.out.println("You can drive the car");
        }
        else
        {
            System.out.println("You cannot drive the car");
        }
    }

    void Student_percentage()
    {
        float percentage;
        System.out.println("Enter your percentage : ");
        percentage = sc.nextFloat();
        if(percentage>90 && percentage<=100)
        {
            System.out.println("Grade : A ");
        }
        else if(percentage>70 && percentage<=90)
        {
            System.out.println("Grade : B ");
        }
        else if(percentage>50 && percentage<=70)
        {
            System.out.println("Grade : C ");
        }
        else if(percentage>40 && percentage<=50)
        {
            System.out.println("Grade : pass");
        }
        else {
            System.out.println("Grade : fail");
        }
    }
    public static void main(String[] args)
    {
        Conditional_statement object = new Conditional_statement();
        object.if_else_condition();
        object.if_else_condition1();
        object.Student_percentage();
    }
}


