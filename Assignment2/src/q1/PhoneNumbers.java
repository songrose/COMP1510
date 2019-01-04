package q1;
import java.util.Random;
import java.text.DecimalFormat;
/**
 * generates phone numbers.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class PhoneNumbers {
    /** static final is 636 . **/
    static final int SIXTHREESIX = 636;
    /** static final is 10000 . **/
    static final int TENTHOUSAND = 10000;
    /** static final is eight . **/

    static final int EIGHT = 8;
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {


        DecimalFormat dec = new DecimalFormat("000");
        
        Random rand = new Random();
       int first = rand.nextInt(EIGHT);
       int second = rand.nextInt(EIGHT);
       int third = rand.nextInt(EIGHT);
        
        String fourth = dec.format(rand.nextInt(SIXTHREESIX));
        int fifth = rand.nextInt(TENTHOUSAND);
        dec.applyPattern("0000");
             
        System.out.println("" + first + second + third + "-" 
        + fourth + "-" + dec.format(fifth));

        
        System.out.println("Question one was called and ran sucessfully.");
    }

};
