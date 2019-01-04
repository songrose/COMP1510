package q2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * <p>This class creates a class called primes. It sets and gets the
 * prime numbers and calculate all the prime numbers between a number
 *  within a range. Moreover you can calculate the prime number to see 
 * if it is prime or not. </p>
 *
 * @author Rose Song
 * @version 1.0
 */
public class Primes {
    /** array list made.**/
    private ArrayList<Boolean> primes = new ArrayList<Boolean>();
    /**int max.**/
    private int max;
    /**
     * Constructs primes.
     * @param max1
     * max1.
     */
    public Primes(int max1) {
       max = max1;
       for (int i = 0; i <= (max); i++) {
           primes.add(true);
           }
       calculatePrime(max);
    }
       /**
        * calculates prime number.
        * @param s
        * calculate the prime number.
        */
       public void calculatePrime(int s) {  
           primes.set(0, false);
           primes.set(1, false);
           for (int i = 2; i <= Math.sqrt(primes.size()); i++) {
               for (int j = (primes.size() - 1); j > i; j--) {
                   if (j % i == 0) {
                       primes.set(j, false);
                   } 
               }
           }
           
       }
       /**
        * Print primes.
        * @return
        * returns all primes.
        */
           public String printPrimes() {
               String stringPrimes = "";
               String number;
               
               int i = 0;
               for (boolean item : primes) {
                   if (item) {
                       number = "" + i;
                       stringPrimes = stringPrimes.concat(number + ", ");
                   }
                   i++;
               }
               return stringPrimes;
           }
           
           //6. a method called isPrime(int x) which returns 
           /**
            * Counts primes.
            * @return count primes. 
            * 
            */
           public  int countPrime() {
               int i = 0;
               for (boolean item : primes) {
                   if (item) {
                       i++;

                   }       

               }
               return i;
           }
           
           /**
            * is a prime number.
            * @param x
            * x is input.
            * @return isPrime
            *  x returns prime if true.
            *  @throws IndexOutOfBoundsException
            *  index out of bounds exception.
            */
           public boolean isPrime(int x) throws IndexOutOfBoundsException {
 
               return  primes.get(x);
             
           }
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an upper bound number");
        int upper = scan.nextInt();
        
        Primes primeHelp = new Primes(upper);
        System.out.println("There are " 
        + Integer.toString(primeHelp.countPrime()) + "prime numbers");
        System.out.println("This is your prime numbers: 0 - " + upper);
        System.out.println(primeHelp.printPrimes());
        System.out.println("Enter a number between 0 and " + upper);
        int x = scan.nextInt();
        try {
            System.out.println(primeHelp.isPrime(x));
            System.out.println(primeHelp.isPrime(x));

        } catch (IndexOutOfBoundsException exception) {
            
            System.out.println("Caught an exception");
        }
        
        scan.close();
    }
};
