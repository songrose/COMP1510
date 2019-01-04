package q2;
import java.util.Scanner;
/**
 * Converts seconds into hours, minutes and seconds.
 * @author Rose Song
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * prompts user seconds. outputs hours, minutes and seconds.
     *
     * @param args
     *          @param args unused
     */
    public static void main(String[] args) {
        int value;
        final int hour = 3600;
        final int minute = 60; 
        int remval;
        int houramount;
        int minuteamount;
        int secondamount; 
        
        Scanner scan = new Scanner(System.in); 
        System.out.println("How many seconds would you like to convert?");
        value = scan.nextInt(); 
        
        houramount = value / hour;
        remval = value % hour; 
        
        minuteamount = remval / minute; 
        remval = remval % minute;
        secondamount = remval; 
        System.out.println(houramount + " : " + minuteamount 
                + " : " + secondamount 
                + "Hours: Minutes: Seconds");
        
        scan.close();
        
     

        
        System.out.println("Question two was called and ran sucessfully.");
    }

};
