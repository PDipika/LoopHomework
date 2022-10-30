import java.util.Scanner;

public class StringInput_a {
    public static void main(String[] args) {
        //object for Scanner class
        Scanner scanner = new Scanner(System.in);
        //variable declaration
        String istring;
        int count = 0;
        char occurrence_of_character = 'a';
        //precondition
        System.out.println("Please Enter a String to Count total Number of 'a' =  ");
        istring = scanner.nextLine();

        // for toCount the characters in the istring
        for (int i = 0; i < istring.length(); i++)
        {
            //if condition to calculate result
            if (istring.charAt(i) == occurrence_of_character) {
                count++;
            }

        }
        //output
        System.out.println("Total number of 'a' in the string: " + count);
    }
}


