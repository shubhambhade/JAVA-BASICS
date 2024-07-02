package comp.company;

public class BreakAndContinueStatement {
    void break_using_loop()
    {
        for (int i=1; i <= 20 ; i++)
        {
            System.out.println(i);
            System.out.println("java is great programming");
            if(i==5)
            {
                System.out.println("Ending the loop");
                break;
            }
        }
    }
    void continue_using_loop()
    {
        for (int i=1; i <= 20 ; i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
            System.out.println("java is great programming");
        }
    }
    public static void main(String[] args){
        BreakAndContinueStatement object = new BreakAndContinueStatement();
//        object.break_using_loop();
        object.continue_using_loop();
    }
}
