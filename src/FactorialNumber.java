import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        //object for Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number here : ");
        //local variable
        int i,fact=1;
        int num;//It is the number to calculate factorial
        num = scanner.nextInt();
        //for condition
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        //output
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}

