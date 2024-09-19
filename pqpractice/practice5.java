import java.util.*;

public class practice5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int o, k, n;
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
        System.out.println("Enter the no of lines");
        n = sc.nextInt();

        // loop to iterate for the given number of rows
        for (int i = 1; i <= rows; i++) {

            // loop to print the number of spaces before the star
            for (int j = rows; j >= i; j--) {
                System.out.print("   ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }

            // for new line after printing each row
            System.out.println();
        }

        for (o = n; o >= 1; o--) {
            for (k = o; k < n; k++) {
                System.out.print("   ");
            }
            for (k = 1; k <= (2 * o - 1); k++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}