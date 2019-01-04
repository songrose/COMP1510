package q3;

/**
 * Creates a message of longs.
 * @author Rose Song
 * @version 1.
 */
public class MessagV2 {
    /** Static int value 11. **/
    private static  final int ELEVEN = 11;
    /**static int 56.**/
    private static  final int FIFTYSIX = 56;

    /** array length.**/
    private int aLength;
    /** Decoder.**/
    private String decoder;
    /** Long array.**/
    private long[] array; 
    /** Counter to go through the  array.**/
    private int counter;
    /** Remaining amount that goes through the array.**/
    private int rem;
    /** Index to go through items of 11 in the array.**/
    private int to11;
    /**
     * Constructs the long array.
     * @param m
     * m is the mixChar array list going in.
     */
    public MessagV2(MIXChar[] m) {
        setArrays(m);
        makeLong(m);
       }
    /**
     * Constructs the long array using strings.
     * @param s
     * String that is coming in to be initialized.
     */
    public MessagV2(String s) {
        char[] carray  = new char[s.length()];
        MIXChar ya;
        MIXChar[] marray = new MIXChar[s.length()];
        for (int i = 0; i < s.length(); i++) {
            carray[i] = s.charAt(i);
            ya = new MIXChar(carray[i]);
            marray[i] = ya;
        }
        setArrays(marray);
        makeLong(marray);
    }
    
    /**
     * Helper method.
     * @param m
     * the array that is going in to be made into the longs.. 
     */
    private void makeLong(MIXChar[] m) {
        if (rem == 0) {
            for (int i = 0; i < aLength; i++) {
                array[i] = 0;
               for (to11 = 0; to11 < ELEVEN; to11++) {
                    array[i] = array[i] * FIFTYSIX + m[counter].returnOrdinal();
                      counter++;
                }
            }
        } else if (rem > 0) {
            for (int i = 0; i < aLength - 1; i++) {
                array[i] = 0;

                for (to11 = 0; to11 < ELEVEN; to11++) {
                    array[i] = array[i] * FIFTYSIX + m[counter].returnOrdinal();
                    counter++;

                    }
                }
                array[array.length - 1] = 0;
                for (int t = 0; t < m.length % ELEVEN; t++) {
                    array[array.length - 1] = array[array.length - 1] * FIFTYSIX
                            + m[counter].returnOrdinal();
                    counter++;
                }
            }
   

    }
    /**
     * Sets the values to make the arrays.
     * @param m
     * Array list m.
     */
       
    private void setArrays(MIXChar[] m) {
   
        aLength = m.length / ELEVEN;
         rem = m.length % ELEVEN;
        if (rem > 0) {
            aLength++;
        }

        array = new long[aLength];
    }
    /**
     * Decoder.
     */
    public void decode() {
        int num;
        long div;
        String s = "";
        
        MIXChar yaa;
        
        for (int i = array.length - 1; i >= 0; i--) {
            div = array[i];
                while (!(div < FIFTYSIX && div <= 0)) {
                    num = (int) (div % FIFTYSIX);
                    div = div / FIFTYSIX;
                    yaa = new MIXChar(num);
                    s += yaa.returnChar();
                }
        }
        decoder = "";
        
        for (int i = s.length() - 1;  i >= 0; i--) {
            decoder += s.charAt(i);
        }
        System.out.println(decoder);
    }
    
    /**
     * Actual decoder!.
     */
    
    public void printDecoded() {
        int num;
        long div;
        String s = "";
        
        MIXChar yaa;
        
        for (int i = array.length - 1; i >= 0; i--) {
            div = array[i];
            
                while (!(div < FIFTYSIX && div <= 0)) {
                    num = (int) (div % FIFTYSIX);
                    div = div / FIFTYSIX;
                    yaa = new MIXChar(num);
                    s += yaa.returnChar();
                }
        }
        decoder = "";
        for (int i = s.length() - 1;  i >= 0; i--) {
            decoder += s.charAt(i);
        }
    }
/**
 * to string method..
 */
    public void tooString() {
        for (long a: array) {
            System.out.println(a);
        }
    }
    /**
     * creates the to longs.
     * @return
     *returns longs.
     */
    public String toLongs() {
        String encoded = "";
        for (long ab : array) {
            encoded += Long.toUnsignedString(ab);
            encoded += "\n";
        }
        return encoded;
        }
    
}
