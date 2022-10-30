
import java.util.Scanner;

public class SumOfEvenOddDigit {
    public static void main(String[] args) {
        //object for Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 Digit Number:");
        //local variables
        int number, singleDigit = 0, sum = 0, even = 0, odd = 0, sum1 = 0, sum2 = 0;
        number = scanner.nextInt();

            // while loop to calculate given condition
            while (number != 0) {
                int reminder = number % 10;
                singleDigit = singleDigit * 10 + reminder;
                number = number / 10;

                sum = sum + reminder;
                //if else condition
                if (reminder % 2 == 0) {
                    even = even + 1;
                    sum1 = sum1 + reminder;

                } else {
                    odd = odd + 1;
                    sum2 = sum2 + reminder;
                }


            }
            //output
            System.out.println("Total even number = " + even);
            System.out.println("Total odd number = " + odd);
            System.out.println(" sum of the even number = " + sum1);
            System.out.println("sum of the odd number = " + sum2);



        }

}