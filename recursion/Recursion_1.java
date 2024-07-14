package recursion;
import java.util.Scanner;
public class Recursion_1 {
    public static void main(String[] args) {
        // factorial(0) =1
        // factorial(n) = n*(n-1) .....1
        // factorial(3) = 3*2*1
        //factorial = n * factorial(n-1)
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        b = sc.nextInt();
        System.out.println("Value of factorial n : "+factorial(b));
    }
    static int factorial(int n){
        if(n==0 || n==1)
       {
           return 1;
       }
       else {
           return n * factorial(n-1);
       }
    }
}
