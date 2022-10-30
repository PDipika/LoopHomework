import java.util.Scanner;

public class SumOfFiveDigit {
    public static void main(String[] args) {
        //object  for Scanner class
        Scanner scanner = new Scanner(System.in);
        // variables to store value
        int num;
        int sum = 0;
       //precondition// enter the number to get the output
        System.out.println("Enter any five digit Number : ");
        // reassigned local variable
        num = scanner.nextInt();
        //loop to find sum of digits
        while(num!=0){
            sum += num % 10;
            num = num / 10;

        }
       //output
        System.out.println ("Sum of five digit number is : " + sum);
    }

    }

