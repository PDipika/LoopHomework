import java.util.Scanner;

public class SumOfFirstAndLastDigitOf5DigitNumber {
    public static void main(String[] args) {

       // object for Scanner class
        Scanner scanner = new Scanner(System.in);
        // taking value from user..
        System.out.println("Enter any 5 Digit number here :");
        int number = scanner.nextInt();
        //declaring two integer variable to store value
        int lastDigit;
       int firstDigit = number ;
        lastDigit = number % 10;

       //while condition
        while (firstDigit>= 10) {
            firstDigit = firstDigit / 10;
        }
        //output
            System.out.println("Sum of first and last Digit of number is " + (firstDigit + lastDigit));

    }
}
