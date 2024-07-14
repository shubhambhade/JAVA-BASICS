package methods;
import java.util.Scanner;
public class Addition {
    public  static int add(int a , int b){
        int sum = a+b;
        return sum;
    }
    static int product(int a ,int b){
        return a*b;
    }
    static void factorial(int a)
    {//loop
        if (a < 0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i = a; i>=1; i--)
        {
            factorial = factorial*i;
        }
        System.out.println("Factorial : "+factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter number 1st : ");
        num1 = sc.nextByte();
        System.out.println("Enter number 1st : ");
        num2 = sc.nextByte();
        int Addition = add(num1,num2);
        System.out.println("Addition : "+ Addition);
        System.out.println("Multiplication : "+ product(num1,num2));
        factorial(num1);
    }
}
