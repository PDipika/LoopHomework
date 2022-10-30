import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        // object for Scanner class
        Scanner scanner = new Scanner(System.in);
        //enter number to prove condition
        System.out.println("enter Natural number to find sum: ");

        //variable declaration
        int sum = 0;
        int num;
        num = scanner.nextInt();
        //executes until the condition returns true
        for (int i = 1; i <= num; i++) {
            //sum=sum+i;
            sum += i;
            {
        //adding the value of i into sum variable
                sum = sum + i;

            }
            //output of given condition
            {  System.out.println("Sum of the numbers until " + num + ":" + sum);

        }
    }



    }
}

