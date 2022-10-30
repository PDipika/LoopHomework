import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //object for Scanner class
        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("Enter number to find  Fibonacci Series : ");
        //local variables
        int num, FirstTerm = 0, SecondTerm = 1;
        num = scanner.nextInt();

        System.out.println("Fibonacci Series till " + num + " terms:");
       // use of for loop to prove condition
        for (int i = 1; i <= num; ++i) {
            System.out.print(FirstTerm + ", ");

            // compute the next term (condition to print Fibonacci series)
            int nextTerm = FirstTerm + SecondTerm;
            FirstTerm = SecondTerm;
            SecondTerm = nextTerm;
        }

    }


}
