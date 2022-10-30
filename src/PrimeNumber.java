import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //local variable
        int num;
        //boolean condition
        boolean isPrime=false;
        //object for Scanner class
        Scanner scan=new Scanner(System.in);
        //create a scanner object for input
        System.out.print("Enter a number: ");
        num=scan.nextInt();//get input from the user for num1
        // for loop to find the result for given condition
        for(int i=2; i<=num/2; i++){

            //condition for non-prime
            if(num%i==0)
            {
                isPrime=true;
                break;
            }
        }//output using if- else condition
        if(!isPrime){
            System.out.println(num+" is a prime numbner ");
        }
        else{
            System.out.println(num+" is not a prime numbner ");
        }




































    }
    }

