package q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p> Calculates the standard deviation and mean of a group of numbers.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Statistics { 
    /** Integer array. **/
    private static  ArrayList<Integer> number = new ArrayList<Integer>();
    
    /** private int temp.**/
    private int tempInt;
 

    /**
     * Creates list of words.
     * @param fileName
     * String file name to find file.
     * @throws IOException
     * for if there is an input output error.
     */
    public void parseBook(String fileName) throws IOException {
        Scanner fileScan;
        fileScan = new Scanner(new File(fileName));
        
        while (fileScan.hasNext()) {
            String nextInt = fileScan.next(); 
            tempInt = Integer.parseInt(nextInt);
            number.add(tempInt);
        }
        
        fileScan.close();
        
    }
    /**
     * Array list.
     * @param aaa
     * is the array list integer being passed in.
     * @return
     * array list of integers.
     */
    public ArrayList<Integer> getAll(ArrayList<Integer> aaa) {
        return  new ArrayList<Integer>(aaa);
    }
    /**
     * gets the mean of the number.
     * @return
     * double mean.
     */
    public double getMean() {
        int a = 0;
        for (int bbb : number) {
            a += bbb;
        }
        double mean = (double) a / number.size();
        return mean;
    }
    /**
     * Calculates the standard devation.
     * @return
     * gets standard deviation.
     */
    public double getSD() {
        double addem = 0.00;
        double cccc = 0;
        for (int bbb : number) {
            cccc = Math.pow((bbb - getMean()), 2);
            addem += cccc;
        }
        addem = Math.sqrt(addem / (number.size() - 1));
        return addem;
    }
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        //replace next line with your code:
        System.out.println("Question one was called and ran sucessfully.");
       Statistics gogo = new Statistics();
        gogo.parseBook("number.txt");
       gogo.getAll(number);
       for (int a : number) {
           System.out.println("" + a);
       }
       System.out.println("Mean: \t" + gogo.getMean());
       System.out.println("Standard Deviation: \t" + gogo.getSD());
       

    }

};
