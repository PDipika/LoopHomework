import java.util.Scanner;

public class NumberDividedBy3And5 {
    public static void main(String[] args) {

        //object class for Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the given start number : 1 ");
        int a = scanner.nextInt();
        System.out.println("Enter the given end number : 100 ");
        int b = scanner.nextInt();
        //variable to store value
        int c = 3;
        int d = 5;
        System.out.println(" given number divided by 3 is :");
        //for condition to get user output
        for(int i =a; i<=b; i++)
        {
            if(i%c==0)
                System.out.println(i);
        }
        System.out.println(" given number divided by 5 is :");
         //for condition to get output for second condition
        for(int i =a; i<=b; i++)
        {
            if(i%d==0)
                System.out.println(i);
        }
    }
}

