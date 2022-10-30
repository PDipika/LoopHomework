import java.util.Scanner;

public class MultiplicationTableSquare {
    public static void main(String[] args) {

       // variable declaration
        int row,colum;
        //object for Scanner class
        Scanner scanner = new Scanner(System.in);
        //user input to get result
        System.out.println("Enter row length");
        row=scanner.nextInt();
        System.out.println("Enter colum height");
        colum=scanner.nextInt();
        int i = 1;
      // do while loop to prove the user condition
        do {
            int j = 1;
            do {
                System.out.print(i * j + "\t");
                j++;
            }while (j <= colum);
            i++;
            System.out.println( );
        }while (i <= row);
    }
}
