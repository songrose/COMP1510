package q1;
import java.util.Scanner;

/**
 * Calculates the smallest units of bills and coins.
 * @author Rose Song
 * @version 1.0
 */
public class Change {
    /**
     * Prompts user input for money, calculates bills and coins.
     *@param args
     *          @param args unused
     */
    public static void main(String[] args) {
        // replace these two lines with your code
        final int bill10 = 1000;
        int amount10;
        final int bill5 = 500;
        int amount5;
        final int coin2 = 200;
        int amount2;
        final int coin1 = 100;
        int amount1; 
        final int coin25c = 25;
        int amount25c;
        final int coin10c = 10;
        int amount10c; 
        final int coin5c =  5; 
        int amount5c;
        int amount1c;
        double value; 
        int value1000;
        final double hundred = 100; 
        final double onetenth = 0.001; 
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of money.");
        value = scan.nextDouble(); 
        value = value + onetenth;
        value = value * hundred;

        value1000 = (int) value; 

        amount10 = value1000 / bill10;
        value1000 = value1000 % bill10;
        
        amount5 = value1000 / bill5;
        value1000 = value1000 % bill5;
        
        amount2 = value1000 / coin2; 
        value1000 = value1000 % coin2;
        
        amount1 = value1000 / coin1; 
        value1000 = value1000 % coin1; 
        
        amount25c = value1000 / coin25c; 
        value1000 = value1000 % coin25c; 

        amount10c = value1000 / coin10c;
        value1000 = value1000 % coin10c;
        
        amount5c = value1000 / coin5c; 
        value1000 = value1000 % coin5c; 
        
        amount1c = value1000;
        
        
        
        System.out.println(amount10 + " ten dollar bills");
        System.out.println(amount5 + " five dollar bills");
        System.out.println(amount2 + " toonies");
        System.out.println(amount1 + " loonies");
        System.out.println(amount25c + " quarters");  
        System.out.println(amount10c + " dimes");  
        System.out.println(amount5c + " nickels");  
        System.out.println(amount1c + " pennies");  
        scan.close();
        System.out.println("Question one was called and ran sucessfully.");
    }

};
