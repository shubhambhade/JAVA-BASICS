package comp.company;
import java.util.*;

public class Switch_Case_Statement {
    Scanner sc = new Scanner(System.in);
    void switch_Case()
    {
        byte age;
        System.out.println("Enter your age : ");
        age = sc.nextByte();
        switch (age)
        {
            case 18:
                System.out.println("you are going to become a adult ");
                break;
            case 23:
                System.out.println("you are going to job ");
                break;
            case 60:
                System.out.println("you are going to retired ");
                break;
            default:
                System.out.println("Enjoy your life ");
        }
        System.out.println("Thanks for using my java program");
    }
    void enhanceSwitch_statement()
    {
        String str = "sham";
        switch (str)
        {
            //in enhance switch statement do not need to write break statement.
            case "sham"->{
                System.out.println("Hello");
                System.out.println("Java");
                System.out.println("Python");
            }
            case "ram"-> System.out.println("flutter");
            case "rahul"-> System.out.println("Kotlin");
            default -> System.out.println("Different technologies experts");
        }
        System.out.print("Thanks");
    }
    public static void main(String[] args)
    {
        Switch_Case_Statement object = new Switch_Case_Statement();
        object.switch_Case();
        object.enhanceSwitch_statement();
    }
}

