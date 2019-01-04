package q3;
import java.util.Scanner;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TestMIXChar {
    
    //the following are for reference, you may want to move them or copy them 
    //to another class.
       /** delta.**/
    private static final char DELTA = '\u0394';
    /** sigma..**/
    private static final char SIGMA = '\u03A3';
    /** PI..**/
    private static final char PI = '\u03A0';
    /**private static.**/

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *runs the program.
     * @param
     * param unused.
     * program run.
     * @param args
     * a is the string.
     */
    public static void main(String[] args) {
        
   
        //replace next line with your code:
        char[] tired =  {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', DELTA, 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R',
                SIGMA, PI, 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', 
                '6', '7', '8', '9', '.', ',', '(', ')',
                '+', '-', '*', '/', '=', '$', '<', '>', '@', ';', ':', '\'' };
        MIXChar yum1 = new MIXChar(tired[1]);

        MIXChar yum2 = new MIXChar(tired[2]);
    
        MIXChar yum3 = new MIXChar(tired[2 + 1]);

        MIXChar yum4 = new MIXChar(tired[2 + 2]);

        MIXChar[] name = new MIXChar[]{ yum1, yum2, yum3, yum4};
        MessagV2 hannah = new MessagV2(name);
        System.out.println(hannah.toLongs());
        hannah.decode();

        Scanner scan  = new Scanner(System.in);
        System.out.println("input a string: ");
        String exp = scan.next();
        MessagV2 ya = new MessagV2(exp);
        System.out.println(ya.toLongs());
        ya.decode();
        scan.close();
    }
     


    }
    
