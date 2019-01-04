package q4;
import java.util.Scanner;
/**
 * Calculates the volume and surface area of a cube using length.
 *
 * @author Rose Song
 * @version 1.0
 */
public class Cube {
    /**
     * Grabs input from user. Outputs calculate variables.
     *
     *@param args
     *          @param args unused
     *      
     */
    public static void main(String[] args) {
        int input;
        int sa;
        int vol;
        final int six = 6;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the length of your cube:");
        input = scan.nextInt();
        sa = input * input * six;
        vol = input * input * input;
        System.out.println("The length of your cube is: " + input
                + "\nThe area of your cube is: " + sa
                + "\n The volume of our cube is:" + vol);
        
        scan.close();
    }

};
