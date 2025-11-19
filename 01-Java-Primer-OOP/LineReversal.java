import java.util.ArrayList;
import java.util.Scanner;

public class LineReversal {

    /**
     * Reads lines from user input and prints them in reverse order.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Line Reversal CLI!");

        // Ask user how many lines they want to add
        System.out.print("How many lines do you want to add? ");
        int counter = Integer.parseInt(scan.nextLine());

        ArrayList<String> lines = new ArrayList<>();

        // Read the user's lines
        while (counter > 0) {
            System.out.println("Enter line (" + counter + " remaining):");
            lines.add(scan.nextLine());
            counter--;
        }

        System.out.println("\nReversed Output:");
        
        // Print the lines in reverse order
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }

        scan.close();
    }
}
