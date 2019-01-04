package q3;
import java.util.Scanner;
/**
 * Calculates multiplication, subtraction, division and produce of two values.
 *
 * @author Rose Song
 * @version 1.0
 */
public class Arithmetic {
    /**
     * prompts user 2 floating point values. Outputs its calculation.
     *@param args
     *          @param args unused
     */
    public static void main(String[] args) {
        float input1;
        float input2;
        float mult;
        float div;
        float sub;
        float add;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first float number:"); 
        input1 = scan.nextFloat(); 
        System.out.println("Input the second float number:");
        input2 = scan.nextFloat();
        mult = input1 * input2;
        div = input1 / input2;
        add = input1 + input2; 
        sub = input1 - input2; 
        System.out.println("This is the product: " + mult 
                + "\nThis is the subtraction: " + sub 
                + "\nThis is the addition:" + add 
                + "\nThis is the division: " + div);
        
        // replace these two lines with your code
        System.out.println("Question three was called and ran sucessfully.");
        scan.close();
    }

};
