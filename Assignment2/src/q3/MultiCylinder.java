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
public class MultiCylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double radius1 = scan.nextDouble();
        
        System.out.println("Enter the height of the cylinder");
        double height1 = scan.nextDouble();
        
        Cylinder cylClass = new Cylinder(radius1, height1);
        
        System.out.println("This is your first radius: " + radius1
                + "\n This is your first height: " + height1);
        System.out.println("Enter the second radius of the cylinder");
        double radius2 = scan.nextDouble();
        System.out.println("Enter the second height of the cylinder");
        double height2 = scan.nextDouble();
        Cylinder cylClass2 = new Cylinder(radius2, height2);
        
        System.out.println("This is your information on your first cylinder: "
                + cylClass.toString()
                + "\nThis is your information on your second cylinder: "
                + cylClass2.toString());
        
        scan.close();
    }

};
