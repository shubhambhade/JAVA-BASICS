
package problem;
import java.util.Scanner;
public class Problem_4
{
    Scanner sc = new Scanner(System.in);
    void convert_string_toLowerCase()
    {
        System.out.println("Enter Upper case string : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println("Converted String :" +str);
    }
    void whitespaces_replace_with_underscore_symbol()
    {
        String str ="java is programming language";
        System.out.println(str);
        str =str.replace(" ","_");
        System.out.println("Replaced whitespaces in string with the help of _ symbol : "+str);

        String letter = "Dear <|name|> ,Thanks a lot";
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Name : "+name);
        letter = letter.replace("<|name|>",name);
        System.out.println(letter);

    }


    public static void main(String[] args)
    {
        Problem_4 object= new Problem_4();
        object.convert_string_toLowerCase();
        object.whitespaces_replace_with_underscore_symbol();
    }
}
