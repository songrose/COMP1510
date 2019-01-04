package q5;
import java.util.Scanner; 
/**
 * Decodes 5 alphabet letters to base 10 and encodes them back to letters.
 *
 * @author Rose Song
 * @version 1.0
 */
public class Pack {
    /**
     * Decodes and encodes given 5 alphabet codes.
     * @param args
     *          @param args unused
     */
    public static void main(String[] args) {
        String stringname; 
        char c1;
        char c2;
        char c3;
        char c4; 
        char c5; 
        final int n0 = 0;
        final int n1 = 1;
        final int n2 = 2;
        final int n3 = 3; 
        final int n4 = 4;

      
        System.out.println("Input the string you want to decode:");
        Scanner scan = new Scanner(System.in);
        stringname = scan.nextLine();
        System.out.println(stringname);
        
        
        c1 = stringname.charAt(n0);
        System.out.println("char 1 is :   " + c1 + "/n");

        c2 = stringname.charAt(n1);
        c3 = stringname.charAt(n2);
        c4 = stringname.charAt(n3);
        c5 = stringname.charAt(n4);
        
      

        final int base56 = 56;
        final int base56power4 = base56 * base56 * base56 * base56;
        final int base56power3 = base56 * base56 * base56; 
        final int base56power2 = base56 * base56; 
        int value1;
        int value2;
        int value3;
        int value4;
        int value5; 
        int encoded;
        value1 = c1 - 'A' + 1;
        System.out.println("\nvalue of char in numbers: " + value1);
        value2 = c2 - 'A' + 1;
        value3 = c3 - 'A' + 1;
        value4 = c4 - 'A' + 1;
        value5 = c5 - 'A' + 1; 
       /** value1 = value1 * base56power4;
        value2 = value2 * base56power3;
        value3 = value3 * base56power2;
        value4 = value4 * base56;
        encoded = (value1 + value2 + value3 + value4 + value5); */
        encoded = value1 * base56power4;
        System.out.println(encoded);
        encoded += value2 * base56power3;
        encoded += value3 * base56power2;
        encoded += value4 * base56;
        encoded += value5;



        
        int remvalue; 
        int d1;
        int d2;
        int d3;
        int d4; 
        int d5;
        char cc1;
        char cc2;
        char cc3; 
        char cc4;
        char cc5; 
        d1 = encoded / base56power4;
        remvalue = encoded % base56power4;
        
        d2 = remvalue / base56power3;
        remvalue = encoded % base56power3; 
        
        d3 = remvalue / base56power2; 
        remvalue = encoded % base56power2;
        
        d4 = remvalue / base56; 
        remvalue = encoded % base56; 
        
        d5 = remvalue;
        
        cc1 = (char) (d1 - 1 + 'A');
        cc2 = (char) (d2 - 1 + 'A');        
        cc3 = (char) (d3 - 1 + 'A');
        cc4 = (char) (d4 - 1 + 'A');
        cc5 = (char) (d5 - 1 + 'A');
        String decoded = (" " + cc1 + cc2 + cc3 + cc4 + cc5);
        System.out.println("this is the encoded: " + encoded);
        System.out.println("This is the encoded string decoded: " + decoded);

        scan.close(); 
        System.out.println("Question five was called and ran sucessfully.");
        
    }

};
