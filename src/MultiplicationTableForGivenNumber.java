import java.util.Scanner;

public class MultiplicationTableForGivenNumber {
    public static void main(String[] args) {
        //object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want the multiplication table :");
         //n object class to read user input value
        int n = scanner.nextInt();
        //for condition to get user output
        for (int i = 1; i <= 10; i++)
        {
            //OUTPUT
            System.out.println(n + "*" + i + " = " + (n * i));

        }
    }
}