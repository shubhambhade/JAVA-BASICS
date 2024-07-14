package methods;

public class MathFunctions {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        System.out.println(Math.min(a,b));//4
        System.out.println(Math.max(a,b));//7
        System.out.println(Math.sqrt(a));//2.0
        System.out.println(Math.pow(a , b)); //16384.0
        System.out.println(Math.abs(-6)); //6
        System.out.println(Math.random()); // print the values between  0 to 1 .
        System.out.println(getRandom());
        System.out.println(rangeValues(10,20));
        System.out.println(Math.floor(4.7)); //4.0
        System.out.println(Math.ceil(4.7));  // 5.0
        System.out.println(Math.round(4.7));  // 5
    }
    // it gives value 0 to number.
     static int getRandom(){
        return (int) (Math.random()*6);
    }
    // it gives range value num1 to num2
    static int rangeValues(int a, int b){
        return (int) (Math.random()*(b-a+1)+a);
    }
}
