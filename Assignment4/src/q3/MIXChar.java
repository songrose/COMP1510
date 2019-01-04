/**
 * 
 */
package q3;


/**
 * Creates a class of MIXChar..
 * @author Rose Song
 * @version 1.
 */
public class MIXChar {
    /** fifty six.**/
    private static final int FIFTYSIX = 56;
    /** delta.**/
    private static final char DELTA = '\u0394';
    /** sigma..**/
    private static final char SIGMA = '\u03A3';
    /** PI..**/
    private static final char PI = '\u03A0';

    /**making the mixchar list. **/
    private static final char[]  MIXCHAR = {' ', 'A', 'B', 'C', 'D', 'E', 
            'F', 'G',
           'H', 'I', DELTA, 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                 SIGMA, PI, 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                 '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                 '.', ',', '(', ')',
                 '+', '-', '*', '/', '=', '$', '<', '>', '@', ';', ':', '\'' };
    /** CHAR name..**/
    private char w1;
    /** ordinal number.**/
    private int ordinal;
    /**
     * int number.
     * @param num
     * number being returned.
     */
    public MIXChar(int num) {
        w1 = MIXCHAR[num];
    }
    

    /**
     * char c.
     * @param c
     *  is the char.
     */
    public MIXChar(char c) {
       if (isMIXChar(c)) {
           w1 = c;
       } else {
           System.out.println("Wrong character: " + c);
       }
      
    }
    /**
     * returns the length. 
     * @return
     * mixchar length.
     */
    public int length() {
        return MIXCHAR.length;
    }
    /**
     * makes the char.
     * @param c
     * is the char.
     * @return
     *  the char c
     *  
     */
    static boolean isMIXChar(char c) {
        for (int i = 0; i < MIXCHAR.length; i++) {
            if (MIXCHAR[i] == c) {
                return true;
            }
        }
    return false;
    }

    /**
     * return ordinal number.
     * @return
     * returns ordinal.
     */
    public int returnOrdinal() {
           for (int i = 0; i < FIFTYSIX; i++) {
            if (w1 == MIXCHAR[i]) {
                ordinal = i;
           
           }
       }
           return ordinal;

    }
    /**
     * return char.
     * @return
     * return char.
     */
    public char returnChar() {
        return w1;
    }
   
    /**
     * get ordinal.
     * @return
     * get ordinal numbe.r
     */

   public int getOrdinal() {
       return ordinal;
   }
   
//   public int getOrdinal(char m){
//       int counter = 0; 
//       int theOrdinal = 0;
//       for (int i = 0; i < 55; i++) {
//           if (m == mixChar[i]) {
//               theOrdinal = i;
//           }
//       }
//       return theOrdinal;
//   }
   /**
    * string to string.
    */
   /**
    * To string method.
    * @return
    * to string.
    */
   public String toString() {
       String nani = "";
       nani += w1;
       return nani;   
   }
}
