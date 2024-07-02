package comp.company;
import java.io.Console;
import  java.util.Scanner;
public class Strings
{
    void string_basic()
    {
        String str = new String("Sham");
        System.out.println("Name: "+str);
        String name ="Ram";
        System.out.println("Name: "+name);

//       another way to printing statement
        int a = 12;
        float b = 3.14f;
        System.out.printf("The value of a is %d and b is %f",a,b);
        System.out.format("\nThe value of a is %d and b is %f",a,b);
    }
    void user_input_string()
    {
        String st;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter string : ");
        st = sc.nextLine();
        System.out.println("String : "+st);
    }
    void string_methods()
    {
        String str ="Sham";
        System.out.println("String : "+str);
        // .length() method
        int value = str.length();
        System.out.println("Length of string : "+value);

        // toLowerCase() method
        String lowercase = str.toLowerCase();
        System.out.println(lowercase);

        //toUpperCase() method
        String uppercase = str.toUpperCase();
        System.out.println(uppercase);

        //trim() method -->it removes the whitespaces in string.
        String name ="        Ram      ";
        System.out.println(name.trim());

        //substring(start)
        String str1 ="java full stack developers";
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(1,5));

        //replace("word" ,"replace word") method
        System.out.println(str1.replace("java","python"));

        //startsWith() method
        boolean a = str1.startsWith("j");
        System.out.println(a);

        //endsWith() method
        boolean b = str1.endsWith("developers");
        System.out.println(b);

        // charAt() method
        System.out.println(str1.charAt(0));

        //indexOff() method
        System.out.println(str1.indexOf("ava"));
        System.out.println(str1.indexOf("a",7));
        // no match the substring then it returns -1
        System.out.println(str1.indexOf("xyz"));
        System.out.println(str1.lastIndexOf("developers"));
        System.out.println(str1.lastIndexOf("va",12));

        //equals() method
        System.out.println(str.equals("Sham")); // true
        System.out.println(str.equals("sham")); // false because case variable is case sensitive.

        //equalsIgnoreCase() method
        System.out.println(str.equalsIgnoreCase("sham"));

    }
    public static void main(String[] args)
    {
        Strings object = new Strings();
        object.string_basic();
        object.user_input_string();
        object.string_methods();
    }
}



