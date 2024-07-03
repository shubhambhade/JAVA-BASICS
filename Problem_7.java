package problem;
import java.util.Scanner;
public class Problem_7 {
    /*
    print the pattern
    * * * *
    * * *
    * *
    *
     */
    void pattern(){
        byte n = 4;
        for (int i =n; i>0 ;i--)
        {
            for(int j = 0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

//    void pattern_using_while_loop(){
//        byte n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number : ");
//        n = sc.nextByte();
//        int i=0;
//        while (i<n)
//        {
//            System.out.println("*");
//        }
//
//    }
    /*
    print the sum of first n even numbers.
     */
    void sum_of_even_numbers()
    {
        int number;
        System.out.println("Enter number and calculate the sum of even numbers : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextByte();
        int sum = 0;
        for (int i=0; i<number; i++)
        {
            sum = sum + (2*i);
        }
        System.out.println("Sum of even numbers : ");
        System.out.print(sum);

    }
    /*
    print the table of n number.
     */
    void table(){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table number : ");
        num = sc.nextInt();
        for (int i= 0 +1 ; i<=10; i++)
        {
            System.out.println(num +" * "+i +" = " +i*num);
        }
    }
/*
find the factorial.
factorial = n * n-1 * n-2* ........ 1
5! = 5*4*3*2*1
 */
    void factorial(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table number : ");
        n = sc.nextInt();
        int factorial = 1;
        int i = 1;
        while (i<=n)
        {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial : "+factorial);
    }
    public static void main(String [] args){
        Problem_7 object = new Problem_7();
        object.pattern();
//        object.pattern_using_while_loop();
        object.sum_of_even_numbers();
        object.table();
        object.factorial();

    }
}
