package q4;

/**
 * 
 * Constructs the box.
 * @author Rose Song
 * @version 1.0
 */
public class Box {
    /** height of the cube.*/
    private double height;
    /** width of the cube.*/
    private double width;
    /** depth of the cube.*/
    private double depth;
    /** fullness of box.*/
    private boolean full;
    /**
     * Constructs input of dimensions to cube.
     * @param heightInput
     *            height
     * @param widthInput
     *            width
     *@param depthInput
     *          depth
     */
    public Box(double heightInput, double widthInput,
            double depthInput) {
        height = heightInput;
        width = widthInput;
        depth = depthInput;
        full = false;
 
    }
    /**
     * mutates height.
     * @param newHeight as new height
     */
    
    public void setHeight(double newHeight) { 
        height = newHeight;
        
    }
    /**
     * mutates height.
     * @param newWidth as new height
     */
    
    public void setWidth(double newWidth) { 
        width = newWidth;
        
    }
    /**
     * mutates depth.
     * @param newDepth as new depth
     */
    
    public void setDepth(double newDepth) { 
        depth = newDepth;
        
    }
    /**
     * mutates true or false.
     * @param newToF sets
     */
    public void setTrueorFalse(boolean newToF) {
       
        full = newToF;
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
     * Returns Wdith.
     * 
     * @return width input 
     */
    
    public double getWidth() {
        return width;
        
    }
    /**
     * Returns depth.
     * 
     * @return depth input 
     */
    
    public double getDepth() {
        return depth;
        
    }
    
    /**
     * Returns true or false.
     * 
     * @return true or false input 
     */
    
    public boolean getToF() {
        return full;
        
    }
    /**
     * calculates toString.
     * @return toStr
     */
    public String toString() {
        String oneLine;
        oneLine = "The box height is: " + this.getHeight()
            + "\nThe box width is: " + this.getWidth()
            + "\nThe box depth is: " + this.getDepth()
            + "\nIs the box full or not?" + this.getToF();
        return oneLine;
    }
    
}
