import java.util.Scanner;

public class PalindromeNumberCheck {

    public static void main(String[] args) {
        //  object class for Scanner
        Scanner scanner = new Scanner(System.in);
        // precondition // please enter the number
        System.out.println("Enter any number: ");
        //local variable
        String reverse = "  ";
        String num = scanner.nextLine();
        int length = num.length();
        //for method to find out put
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + num.charAt(i);
        //if else condition for output method to print the result
        if (num.equals(reverse))
            System.out.println("The entered number " + num + " is a palindrome.");
        else
            System.out.println("The entered number " + num + "  isn't a palindrome.");
    }
}
