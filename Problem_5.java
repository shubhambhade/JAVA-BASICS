/*
    calculate income tax paid by employee
    income          tax
    2.5L-5.0l        5%
    5.0L-10.0L       20%
    10.0L Above      30%

 */
package problem;
import java.util.Scanner;
public class Problem_5 {
    void calculate_Income_Tax(){
        float tax=0;
        int income;
        System.out.println("Enter Your income in lacks and calculate tax : ");
        Scanner sc = new Scanner(System.in);
        income = sc.nextInt();
        if(income<=250000)
        {
            tax = tax +0;
            System.out.println("Tax is "+tax);
        }
        else if(income>250000 && income<=500000)
        {
            tax = tax + 0.05f *(income-250000);
            System.out.println("tax on your income : "+tax);
        }
        else if(income>500000 && income<=1000000)
        {
            tax = tax + 0.05f *(500000-250000);
            float tax1 = 0.2f *(income-500000);
            float total = tax +tax1;
            System.out.println("tax on your income : "+ total);
        }
        else if( income>1000000)
        {
            tax = tax + 0.05f *(500000-250000);
            float tax1 = 0.2f *(1000000-500000);
            float tax2 = 0.3f *(income-1000000);
            float total = tax + tax1 +tax2;
            System.out.println("tax on your income : "+ total);
        }
    }
    public  static void main(String[] args)
    {
        Problem_5 object = new Problem_5();
        object.calculate_Income_Tax();
    }
}
