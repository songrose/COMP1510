package q5;

import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.scene.text.Font;
/**
 *builds an email that shows email attributes.
 * @author Rose Song
 * @version 1.0
 */
public class EmailPane extends GridPane {
    /** static final is three . **/
    static final int THREE = 3;
    /** static final is four . **/
    static final int FOUR = 4;
    /** static final is five . **/
    static final int FIVE = 5;
    /** static final is six . **/
    static final int SIX = 6;

    /** Holds the converted textfield to. */

    private TextField to;
    /** Holds the converted textfield cc. */
    private TextField cc;
    /** Holds the converted textfield bcc. */

    private TextField bcc;
    /** Holds the converted textfield addresslist. */

    private TextField addresslist;
    /** Holds the converted textfield subjectLine. */

    private TextField subjectline;
    /** Holds the converted textArea message. */

    private TextArea message;
    /**
     * constructs the email pane.
     * 
     */

    public EmailPane() {
        final int fontSize = 12;

        Font font = new Font(fontSize);
        
        Label inputLabel1 = new Label("To:");
        inputLabel1.setFont(font);
        GridPane.setHalignment(inputLabel1, HPos.LEFT);
        
        Label inputLabel2 = new Label("CC:");
        inputLabel2.setFont(font);
        GridPane.setHalignment(inputLabel2, HPos.LEFT);     

        Label inputLabel3 = new Label("BCC:");
        inputLabel3.setFont(font);
        GridPane.setHalignment(inputLabel3, HPos.LEFT); 
        
        Label inputLabel4 = new Label("Address List:");
        inputLabel4.setFont(font);
        GridPane.setHalignment(inputLabel4, HPos.LEFT); 
        
        Label inputLabel5 = new Label("Subject Line:");
        inputLabel5.setFont(font);
        GridPane.setHalignment(inputLabel5, HPos.LEFT); 
        
        Label inputLabel6 = new Label("Message:");
        inputLabel6.setFont(font);
        GridPane.setHalignment(inputLabel6, HPos.LEFT); 
        
        to = new TextField();
        to.setAlignment(Pos.CENTER);
        
        cc = new TextField();
        to.setAlignment(Pos.CENTER);
        
        bcc = new TextField();
        to.setAlignment(Pos.CENTER);
        
        addresslist = new TextField();
        to.setAlignment(Pos.CENTER);
        
        subjectline = new TextField();
        to.setAlignment(Pos.CENTER);
        
        message = new TextArea();
        to.setAlignment(Pos.CENTER);
        
        Button send = new Button("Send");
        send.setOnAction(this::processReturn);
        
        add(inputLabel1, 0, 0);
        add(to, 1, 0);

        add(inputLabel2, 0, 1);
        add(cc, 1, 1);

        add(inputLabel3, 0, 2);
        add(bcc, 1, 2);
        

        add(inputLabel4, 0, THREE);
        add(addresslist, 1, THREE);

        add(inputLabel5, 0, FOUR);
        add(subjectline, 1, FOUR);

        add(inputLabel6, 0, FIVE);
        add(message, 1, FIVE);
        add(send, 0, SIX);
        }
    
    /**
     * Computes and displays the email information.
     * 
     * @param event
     *            invokes this method
     */
        public void processReturn(ActionEvent event) {

            System.out.println("To: " + to.getText()
                    + "\n CC: " + cc.getText()
                    + "\n BCC: " + bcc.getText()
                    + "\n Address List: " + addresslist.getText()
                    + "\n Subject Line: " + subjectline.getText()
                    + "\n Message: " + message.getText());
            to.setText("");
            cc.setText("");
            bcc.setText("");
            addresslist.setText("");
            subjectline.setText("");
            message.setText("");
    }
}
