
/*
write java program to encrypt a grade by adding
8 to it. decrypt it to show the correct grade.
 */
package problem;
public class Problem_2 {
    public static void main(String[] args)
    {
        char grade = 'B';
        System.out.println("Original Grade :"+grade);
        // Encrypt the grade
        grade = (char)(grade + 8);
        System.out.println("Grade :"+grade);
        //Decrypt the grade
        grade = (char)(grade - 8);
        System.out.println("Grade :"+grade);
    }
}
