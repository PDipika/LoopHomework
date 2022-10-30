

import java.util.Scanner;

public class Reverse5DigitNumber {

    public static void main(String[] args) {
        //object for Scanner class
        Scanner scanner = new Scanner(System.in);
        //variables to store value
        int number;
        int reverse = 0;
        //enter the number for given condition
        System.out.println("Enter Any 5 Digit Number");
        number = scanner.nextInt();
        //for loop method to find result for give condition
        for ( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        // output printout
        System.out.print("The reverse of the given 5 Digit Number is: " + reverse );

    }
    }





