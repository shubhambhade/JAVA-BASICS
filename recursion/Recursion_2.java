/*
print number  5 to 1.
 */
package recursion;
public class Recursion_2 {
    static void printNum(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        printNum(a-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }
}
