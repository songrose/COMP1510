package q3;

import java.util.Random;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TestStudent {
    /** constant 5. **/
    private static final int FIVE = 5;
    /**
     * This is the main method (entry point) that gets called by the JV.
     *
     * @param args command line arguments.
     * runs the code.
     */
    public static void main(String[] args) {
        Random random = new Random();
        String first = "Stella";
        String last = "Tran";
        String h1 = "Barley";
        String h2 = "Burnaby";
        String h3 = "bc";
        String h4 = "v1v f3f";
        String s1 = "Willingdon";
        String s2 = "Burnaby";
        String s3 = "BC";
        String s4 = "v2v f3f";
        int one = random.nextInt(FIVE);
        int two = random.nextInt(FIVE);
        int three = random.nextInt(FIVE);
        Address home = new Address(h1, h2, h3, h4);
        Address school = new Address(s1, s2, s3, s4);
        Student stud = new Student(first, last, home, school);
        stud.setAllTestScore(one, two, three);
        System.out.println(stud.toString());
    
    }

};
