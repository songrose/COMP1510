package q3;

import java.text.DecimalFormat;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Cylinder {
    /**r variable of the cube.*/

    private double radius;
    /**height variable of the cube.*/

    private double height;
    /**
     * Constructs input of dimensions to cube.
     * @param inpR
     *            x value of cube
     * @param inpH
     *            y value of cube
     */
    public Cylinder(double inpR, double inpH) { 
        radius = inpR;
        height = inpH;
    }
    /**
     * Returns radius.
     * 
     * @return radius input 
     */
    
    public double getRadius() {
        return radius;
    
    }
    /**
     * Returns height.
     * 
     * @return height input 
     */
    
    public double getHeight() {
        return height;
        
    }
    
    /**
     * Mutates radius .
     * @param setRadius as new radius
     */
    public void setRadius(double setRadius) {
        radius = setRadius;
    }
    /**
     * mutates height.
     * @param setHeight as new height
     */
    public void setHeight(double setHeight) {
        height = setHeight;
    }
    /**
     * calculates surface area.
     * @return sa
     */
    public double surfaceArea() {
        final double two = 2.0;
        double sa = two * Math.PI * radius * (radius + height);
        return sa; 
    }
    /**
     * calculates volume.
     * @return volume
     */
    public double volume() {
        final double two = 2.0;
       
        double vol = Math.PI * Math.pow(radius, two) * height;
        return vol;
        }
    /**
     * calculates toString.
     * @return toStr
     */
    
    public String toString() {
        DecimalFormat fmt = new DecimalFormat("#.####");
        String toStr = "\nThis is your radius: " + radius
            + "\n This is your height: " + height
            + "\n This is your surface area: "
            + fmt.format(this.surfaceArea())
            + "\n This is your volume: "
            + fmt.format(this.volume());
        return toStr;
    }
}
