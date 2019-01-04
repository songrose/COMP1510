package q2;



import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */

public class DrawStar extends Application {
    /**line 1.**/
    private Line currentLine1;
    /**line 2.**/
    private Line currentLine2;
    /**line 3.**/
    private Line currentLine3;
    /**line 4.**/
    private Line currentLine4;
    /**line 5.**/
    private Line currentLine5;
    /**double cos.**/
    private double cos = Math.cos(2 * Math.PI / (2 + 2 + 1));
    /**double sin.**/

    private double sin = Math.sin(2 * Math.PI / (2 + 2 + 1));
    /** The contents of the application scene. */
    private Group root;

    /** center point. */
    private Point2D center;
    
    /** temp point 1. */
    private Point2D p1;
    /**  point 2. */

    private Point2D p2; 
    /**  point 3. */

    private Point2D p3;
    /**  point 4. */

    private Point2D p4;
    /**  point 5. */

    private Point2D p5;
    /**  temp. */

    private Point2D  temp;
    
    /** circle to move to first mouse click location. */
   
    private int strokeWidth = (2 + 1);
    

    /**
     * Displays an initially empty scene, waiting for the user to draw lines
     * with the mouse.
     * 
     * @param primaryStage
     *            a Stage
     */
    
    
    public void start(Stage primaryStage) {
        root = new Group();

        final int appWidth = 1000;
        final int appHeight = 800;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);
        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);

        primaryStage.setTitle("Star");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    /**
     * Mouse event when mouse clicks. it makes the dot.
     * @param event
     * mouse click area taken in. 
     */
    public void processMousePress(MouseEvent event) {
        Circle circle = new Circle();
        circle.setCenterX(event.getX());
        circle.setCenterY(event.getY());
        circle.setRadius(2);
        circle.setStroke(Color.CYAN);
        circle.setStrokeWidth(strokeWidth * strokeWidth);
        center =  new Point2D(event.getX(), event.getY());
        /** current line 1.*/
        currentLine1 = new Line(event.getX(), 
                event.getY(), event.getX(), event.getY());
        /** current line 2.*/
        currentLine2 = new Line(event.getX(), 
                event.getY(), event.getX(), event.getY());
        /** current line 3.*/
        currentLine3 = new Line(event.getX(), 
                event.getY(), event.getX(), event.getY());
        /** current line 4.*/
        currentLine4 = new Line(event.getX(), event.getY(),
                event.getX(), event.getY());
        /** current line 5.*/
        currentLine5 = new Line(event.getX(), event.getY(),
                event.getX(), event.getY());
        

        currentLine1.setStroke(Color.CYAN);
        currentLine1.setStrokeWidth(strokeWidth);
        
        currentLine2.setStroke(Color.CYAN);
        currentLine2.setStrokeWidth(strokeWidth);
        
        currentLine3.setStroke(Color.CYAN);
        currentLine3.setStrokeWidth(strokeWidth);
        
        currentLine4.setStroke(Color.CYAN);
        currentLine4.setStrokeWidth(strokeWidth);
        
        currentLine5.setStroke(Color.CYAN);
        currentLine5.setStrokeWidth(strokeWidth);
        
        
        root.getChildren().add(circle); 

        root.getChildren().add(currentLine1); 
        root.getChildren().add(currentLine2); 
        root.getChildren().add(currentLine3); 
        root.getChildren().add(currentLine4); 
        root.getChildren().add(currentLine5); 
        root.getChildren().add(circle); 

        }
    /**
     * Runs the mouse drag event.
     * @param event
     * Event where mouse is dragged.
     */
    public void processMouseDrag(MouseEvent event) {       
        p1 = new Point2D(event.getX(), event.getY());
        temp =  new Point2D(event.getX() 
                - center.getX(), (event.getY() - center.getY()));
        p2 = new Point2D(((temp.getX() * cos) 
                - (temp.getY() * sin)),  ((temp.getX() * sin) 
                        + (temp.getY() * cos)));
        p3 = new Point2D(((p2.getX() * cos)
                - (p2.getY() * sin)),  ((p2.getX() * sin) 
                        + (p2.getY() * cos)));
        p4 = new Point2D(((p3.getX() * cos) 
                - (p3.getY() * sin)), ((p3.getX() * sin
                        ) + (p3.getY() * cos)));
        p5 = new Point2D(((p4.getX() * cos) 
                - (p4.getY() * sin)),  ((p4.getX() * sin) + (p4.getY() * cos)));



        
        p2 = new Point2D((p2.getX() + center.getX()),
                (p2.getY() + center.getY()));


         p3 = new Point2D((p3.getX() 
                 + center.getX()),  (p3.getY() + center.getY()));

         p4 = new Point2D((p4.getX() 
                 + center.getX()),  (p4.getY() + center.getY()));
         p5 = new Point2D((p5.getX() 
                 + center.getX()),  (p5.getY() + center.getY()));
       

         currentLine1.setStartX(p1.getX());
         currentLine1.setStartY(p1.getY());
         currentLine1.setEndX(p3.getX());
         currentLine1.setEndY(p3.getY());

         currentLine2.setStartX(p2.getX());
         currentLine2.setStartY(p2.getY());
         currentLine2.setEndX(p4.getX());
         currentLine2.setEndY(p4.getY());
         
         currentLine3.setStartX(p3.getX());
         currentLine3.setStartY(p3.getY());
         currentLine3.setEndX(p5.getX());
         currentLine3.setEndY(p5.getY());
         
         currentLine4.setStartX(p4.getX());
         currentLine4.setStartY(p4.getY());
         currentLine4.setEndX(p1.getX());
         currentLine4.setEndY(p1.getY());
         
         currentLine5.setStartX(p5.getX());
         currentLine5.setStartY(p5.getY());
         currentLine5.setEndX(p2.getX());
         currentLine5.setEndY(p2.getY());

       }
    
    /**
     * Launches the JavaFX application.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

