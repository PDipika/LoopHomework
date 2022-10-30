import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // object for Scanner class
        Scanner scanner = new Scanner(System.in);
        // variable declaration
        int originalNumber, remainder, result = 0;
        int a;
        // precondition enter the number to get output
        System.out.println("Enter any number here :");
        a = scanner.nextInt();
        originalNumber = a;
        if (a>0)
        {
            // first  loop to count the number of digit in the number
            while (a != 0)
            {
                remainder = a % 10;
                result += Math.pow(remainder, 3);
                a = a / 10;

            }
            //if else statement to count user output
            if (result == originalNumber)
            {
                System.out.println(originalNumber + " is an Armstrong number.");
            }
            else
            {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }

        }
        else
        {
            System.out.println("Invalid number");
        }
        }
    }