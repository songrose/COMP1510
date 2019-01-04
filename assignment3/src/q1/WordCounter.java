package q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */



public class WordCounter {
    /**creates constant TEN.**/
    private static final int TEN = 10;
    /** array of list.**/
    private ArrayList<Word> listOfWords = new ArrayList<Word>();

    /**
     * This java program scans files.
     * @param fileName
     * file name.
     * @return fileName
     * fileName is name of file.
     * @throws IOException
     *  io exception if no file is found.
     */
    
    public int parseBook(String fileName) throws IOException {
        Scanner fileScan;

        fileScan = new Scanner(new File(fileName));
     // System.out.println(new File(fileName).getAbsolutePath());
      // System.out.println(new File(fileName).length());
       // System.out.println(new File(fileName).exists());
        //System.out.println(fileScan.hasNext());

        while (fileScan.hasNext()) {
            String nextWord = fileScan.next();
            boolean wordExists = false;
            for (int i = 0;  i < (listOfWords.size() - 1); i++) {
                if (listOfWords.get(i).getString().equals(nextWord)) {
                    listOfWords.get(i).increaseFrequency();
                    wordExists = true;
                }               
            }
            if (!wordExists) {
                Word c = new Word(nextWord);
                listOfWords.add(c);
            }
        }   
        fileScan.close();

        return (listOfWords.size());
    }
    /**
     * This program calculates and prints the top 10 words.
     * @param n
     * number of top words.
     * @return 
     * returns string.
     */
    public String printTopWords(int n) {
        Collections.sort(listOfWords);
        Iterator<Word> sort = listOfWords.iterator();
        String fullList = "";
        int i = 0;
            while (sort.hasNext() && i < n) {

                Word c = sort.next();
                fullList = fullList + c.wordToString();
                i++;

                            
        }
        
            
        return fullList;
    }
    /**
     * runs the main program.
     * @param args
     * runs the program.
     * @throws IOException
     * found when no text file.
     */
    public static void main(String[] args) throws IOException {       
        WordCounter gogo = new WordCounter();
        System.out.println("Number of words: " + gogo.parseBook("bible.txt")
            + "\nThe top words are \n" + gogo.printTopWords(TEN));
     }

}