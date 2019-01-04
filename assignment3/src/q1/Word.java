/**
 * 
 */
package q1;


/**
 * Constructs word.
 * @author Rose Song
 * @version 1
 */
public class Word implements Comparable<Word> {
    /** frequency of word.**/
    private int frequency;
    /** String of word.**/

    private final String word;
    
/**
 * Constructs word.
 * @param userInput
 * Accepts user input to construct frequency and word**/
 
    public Word(String userInput) {
        frequency = 1;
        word = userInput;
    }
    /**
     * getter for word.
     * @return
     * Returns word.
     */
    
    public String getString() {
        return word;
    }
    /**
     * gets the frequency.
     * @return
     * returns the frequency
     */
    public int getFrequency() {
        return frequency;   
    }
    /**
     * sets the frequency.
     * @param frequencyUser
     * sets frequencyUser.
     */
    public void setFrequency(int frequencyUser) {
        frequency = frequencyUser;   
    }
    /**
     * 
     *increases the frequency.
     *@param frequency
     *
     */
    public void increaseFrequency() {
        frequency++;
    }
    /**
     *puts the word to string. 
     * @return
     * string is word.
     */
    public String wordToString() {
        String toString = " \nYour word is: " + word 
                + "\nYour frequency is: " + frequency;
        return toString;
    }
    
@Override 
    public int compareTo(Word other) {
    
    return Integer.compare(other.getFrequency(), this.frequency);
    }

}

