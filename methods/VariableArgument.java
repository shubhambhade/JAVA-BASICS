package methods;

public class VariableArgument {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b , int c){
//        return a+b +c;
//    }
    static int sum (int ... arr){
        // Available as int [] arr;
        int add =0;
        for(int i: arr)
        {
            add += i;
        }
        return add;
    }
    public static void main(String[] args) {
        System.out.println("Variable argument concepts");
//        System.out.println("Sum : "+ sum(3,4));
//        System.out.println("Sum : "+ sum(3,4 , 5));
        System.out.println("Sum : "+ sum(3,4));
        System.out.println("Sum : "+ sum(3,4 , 5));
        System.out.println("Sum : "+ sum()); // ans-->0
    }
}
