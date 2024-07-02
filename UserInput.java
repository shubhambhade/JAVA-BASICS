package comp.company;
import java.util.Scanner;

public class UserInput {
    public static void main(String [] args)
    {
        System.out.println("******Taking Input From The User******");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum :"+sum);
    }
}
