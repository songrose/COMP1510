package q2;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class CylinderStats {
    /** two .   **/
    static final double TWO = 2.0;



/**
 * runs the main method.
 * @param args
 * returns args.
 */

    public static void main(String[] args) {
        // your code will go here!!!
        
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the Cylinders Radius?.");
        double radius = scan.nextDouble();
        System.out.println("What is the Cylinders Height?");
        double height = scan.nextDouble();
        double sa = TWO * Math.PI * radius * (radius + height);
        double vol = Math.PI * Math.pow(radius, TWO) * height;
        DecimalFormat fmt = new DecimalFormat("#.####");
        System.out.println("This is your radius: " + radius
                + "\n This is your height: " + height
                + "\n This is your surface area: "
                + fmt.format(sa)
                + "\n This is your volume: "
                + fmt.format(vol));
            

        scan.close();
    }

};
