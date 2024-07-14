package methods;

public class MethodsOverloading {
    /* static  void change(int a){
        a = 98;
    }
    static void change2(int []b){
        b[0] = 98;
    }
     */
    static void  foo()
    {
        System.out.println("Good morning sham");
    }
    static void  foo(String a) // a-->parameter.
    {
        System.out.println("Good Morning "+a + " bro!");
    }
    public static void main(String[] args) {
        /*// case -1 :changing the integer.
        // but it cannot change. because its passing object to method.
        int x = 45;
        change(x);
        System.out.println("The value of x after running change method is : "+x);
        // but it can change. because its passing object to method.
        int [] marks = {55,66,77,88,98};
        change2(marks);
        System.out.println("The value of marks after running change method is : "+marks[0]);
         */
        foo();
        String x = "Ram";
        foo(x); // x --> argument --> arguments are actual.
    }
}
