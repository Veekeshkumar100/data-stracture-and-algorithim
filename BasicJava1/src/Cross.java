import java.util.*;

/**
 * Program to print a cross pattern using stars (*)
 * 
 * Example output for size 5:
 *     *       *
 *      *     *
 *       *   *
 *        * *
 *         *
 *        * *
 *       *   *
 *      *     *
 *     *       *
 */
public class Cross {

    // Print a cross pattern of given size
    public static void printCross(int size) {
        // Upper half (including middle)
        for (int i = 0; i < size; i++) {
            // Left diagonal
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            // Middle spaces
            if (i != size - 1) {
                for (int j = 0; j < (2 * (size - 1 - i) - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half (mirror of upper)
        for (int i = size - 2; i >= 0; i--) {
            // Left diagonal
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            // Middle spaces
            for (int j = 0; j < (2 * (size - 1 - i) - 1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the cross (e.g., 5):");
        
        int size;
        try {
            size = Integer.parseInt(sc.nextLine().trim());
            if (size <= 0) {
                System.out.println("Size must be positive. Using default size 5.");
                size = 5;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Using default size 5.");
            size = 5;
        }
        
        printCross(size);
        sc.close();
    }
}
