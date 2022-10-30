import java.util.Scanner;

public class Print10Numbers {
    public static void main(String[] args) {
        //object for Scanner class
        Scanner scanner = new Scanner(System.in);
        //enter any number
        System.out.println("Enter start number :");

        int a = scanner.nextInt();
        //enter 10th digit number from 1st entered number
        System.out.println("Enter end number  :");
        int b = scanner.nextInt();
        // use of for loop
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }

    }
}
