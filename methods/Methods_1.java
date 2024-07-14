package methods;
public class Methods_1 {
    //static method.
    static int sum(int x , int y){
        int z = x+y;
        return z;
    }
    //instance method
    int subtraction(int p , int q)
    {
        int r = p-q;
        return r;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = sum(a ,b);
        System.out.println("c : "+c);
        Methods_1 obj = new Methods_1();
        System.out.println("Subtraction : "+obj.subtraction(a , b));
    }
}
