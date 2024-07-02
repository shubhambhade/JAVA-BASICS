package comp.company;

public class PrecedenceOfOperators {
    public static void main(String[] args)
    {
        System.out.println("Precedence");
        int a = 6*5-34/2;
        /*
        =6*5-34/2
        =30-34/2
        =30-17
        =13
         */
        System.out.println("a :"+a);
        System.out.println("Associativity");
        int b = 60/5-34*2;
        /*
        =60/5-34*2
        =12-34*2
        =12-68
        =-56
         */
        System.out.println("b :"+b);
    }
}
