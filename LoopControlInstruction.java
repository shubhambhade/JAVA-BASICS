package comp.company;

public class LoopControlInstruction {
    void while_loop()
    {
        int i = 1;
        while (i<=100)
        {
            System.out.println("I : "+ i);
            i++;
        }
        System.out.println("finish while loop");
    }
    void do_while_loop()
    {
        int j =1;
        do {
            System.out.println("j : " + j);
            j++;
        }
        while (j<=100);

    }
    void for_loop()
    {
//        for(int k= 1 ; k <= 100; k++)
//        {
//            System.out.println("K : "+ k );
//        }
        //print odd number
        System.out.println("Odd number");
        for(int k= 1 ; k <= 100; k++)
        {
            System.out.println("K : "+ k );
            k++;
        }
        //print even number
        System.out.println("Even Number");
        for(int m= 1 ; m <= 50; m++)
        {
                System.out.println("m : "+ 2*m );
        }
    }

    public static void main(String [] args){
        LoopControlInstruction object = new LoopControlInstruction();
//        object.while_loop();
//        object.do_while_loop();
        object.for_loop();
    }
}
