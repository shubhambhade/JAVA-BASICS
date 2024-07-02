package comp.company;
public class Operators {
    void arithmeticOperators()//( + , - , * , / , % )
    {
        int num1,num2;
        num1=12;num2=5;
        System.out.println("\nArithmetic Operators");
        int addition = num1+num2;
        System.out.println("Addition(+) :"+addition);
        int subtraction = num1-num2;
        System.out.println("Subtraction(-) :"+subtraction);
        int multiplication = num1*num2;
        System.out.println("Multiplication(*) :"+multiplication);
        int division = num1/num2;
        System.out.println("Division(/) :"+division);
        int modulo = num1%num2;
        System.out.println("Remainder(%) :"+modulo);

    }
    void assignmentOperator() //( = , += , -= )
    {
        System.out.println("\nAssignment Operator");
        int a=3;
        System.out.println("a :"+a);
        a+=5;
        System.out.println("a :"+a);
        a -= 3;
        System.out.println("a :"+a);
    }
    void comparisonOperator() //( == , < , <= , > , >= )
    {
        System.out.println("\nComparison Operator");
        int x,y;
        x=12; y=23;
        System.out.println(x==y); // false
        System.out.println(x<y); //true
        System.out.println(x<=y); //true
        System.out.println(x>y);  //false
        System.out.println(x>=y);  //false
    }
    void logicalOperator() //( && , || , ! )
    {
        System.out.println("\nLogical operator");
        System.out.println(1<2 && 10>4); // true
        System.out.println(1<2 || 10<4); // true
        System.out.println(5!=3); // true
    }
    void  bitwiseOperator() //( & , | )
    {
        System.out.println("\nBitwise Operator");
        /*
        2 -> 1 0
        3 -> 1 1
        ----------
             1 0
             ans->2
         */
        System.out.println(2&3); //2
        System.out.println(2|3); //3
    }
    void incrementOperator()
    {
        System.out.println("\nIncrement operator");
        int i = 56;
        System.out.println(i++); // 56
        System.out.println(i); // 57
        int j = 56;
        System.out.println(++j); //57
        System.out.println(j); // 57
        //character increment
        char  ch ='a';
        System.out.println("ch :"+ch); //a
        ++ch;
        System.out.println("ch :"+ch); //b
    }
    void decrementOperator()
    {
        System.out.println("\nDecrement operator");
        int i = 56;
        System.out.println(i--); // 56
        System.out.println(i); // 55
        int j = 56;
        System.out.println(--j); //55
        System.out.println(j); // 55
        //character decrement
        char  ch ='B';
        System.out.println("ch :"+ch); //B
        --ch;
        System.out.println("ch :"+ch); //A
    }
    void ternary_Operator()
    {
        int a = 10, b = 20;
        String s = (a>b)?"a is greater":"b is greater";
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        System.out.println("******Types of Operators*****");
        Operators object = new Operators();
        object.arithmeticOperators();
        object.assignmentOperator();
        object.comparisonOperator();
        object.logicalOperator();
        object.bitwiseOperator();
        object.incrementOperator();
        object.decrementOperator();
        object.ternary_Operator();
    }
}
