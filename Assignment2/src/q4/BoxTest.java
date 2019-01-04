package q4;
import java.util.Scanner;
/**
 *Launches the box.
 *
 * @author Rose Song
 * @version 1.0
 */
public class BoxTest {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
        System.out.println("What is your box width?.");
        double width1 = scan.nextDouble();
        System.out.println("What is your box height?");
        double height1 = scan.nextDouble();
        System.out.println("What is the box depth?");
        double depth1 = scan.nextDouble();
        Box box1 = new Box(width1, height1, depth1);

        
        System.out.println("What is your box 2 width?.");
        double width2 = scan.nextDouble();
        System.out.println("What is your box 2 height?");
        double height2 = scan.nextDouble();
        System.out.println("What is the box 2 depth?");
        double depth2 = scan.nextDouble();

        Box box2 = new Box(width2, height2, depth2);
        
        System.out.println("This is the box1 information: " + box1.toString()
                + "\nThis is the box 2 information: " + box2.toString());

        
        System.out.println("Is the box 1 full or not? "
                + "Please print true or false");
        boolean full1 = scan.nextBoolean(); 
        box1.setTrueorFalse(full1);
        
        System.out.println("Is the box 2 full or not? "
                + "Please print true or false");
        boolean full2 = scan.nextBoolean(); 
        box2.setTrueorFalse(full2);

        
        System.out.println("This is the box1 information: " + box1.toString()
        + "\nThis is the box 2 information: " + box2.toString());
        
        scan.close();
        
        
    }

};
