package q4;
import java.util.Random;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TestCourse {
    /** constant 15 in int.**/
    public static final int FIFTEEN = 15;

    /**constant as 1.**/
    public static final int ONE = 1;
    /**Constant as 2.**/
    public static final int TWO = 2;
    /**Constant as 3. **/
    public static final int THREE = 3;
    /** Constant as 4. **/
    public  static final int FOUR = 4;
    /** constant as 5.**/
    public static final int FIVE = 5;
    /** constant as 6.**/
    public static final int SIX = 6;
    /** constant as 7.**/
    public static final int SEVEN = 7;
    /** constant as 8.**/
    public static final int EIGHT = 8;
    /** constant as 9.**/
    public static final int NINE = 9;
    /** constant as 10.**/
    public static final int TEN = 10;
    /** constant as 11.**/
    public static final int ELEVEN = 11;
    /** constant as 12.**/
    public static final int TWELVE = 12;
    /** constant as 13.**/
    public static final int THIRTEEN = 13;
    /** constant as 14.**/
    public static final int FOURTEEN = 14;
    
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        // your code will go here!!!
        int [] testing = new int[FIFTEEN];
        for (int i = 0; i < FIFTEEN; i++) {
            testing[i] = rand.nextInt(TEN);
        }
            
        
        Address add1 = new Address("Abc Street", "Vancouver", "BC", "V3A QWE");
        Address add2 = new Address("Def Street", "Burnaby", "BC", "V3A EWQ");
        Address add3 = new Address("Ghi Street", "Surrey", "BC", "V3A REW");
        Address add4 = new Address("Jkl Street", "Coquitlam", "BC", "V3A FSD");
        Address add5 = new Address("Mno Street", 
                "North Vancouver", "BC", "V3A BVC");

        Address school = new Address("3700 Willingdon", 
                "BCIT", "BC", "H3L PM3");
        Student stella = new Student("Stella", "Tran", add1, school);
        Student hannah = new Student("Hannah", "Cheong", add2, school);
        Student paula = new Student("Paula", "Door", add3, school);
        Student catherine = new Student("Catherine", "Knob", add4, school);
        Student jenny = new Student("Jenny", "Pack", add5, school);
        stella.setAllTestScore(testing[0], testing[1], testing[2]);
        hannah.setAllTestScore(testing[FOUR], testing[FIVE], testing[THREE]);
        paula.setAllTestScore(testing[SIX], testing[SEVEN], testing[EIGHT]);
        catherine.setAllTestScore(testing[NINE], testing[TEN], testing[ELEVEN]);
        jenny.setAllTestScore(testing[TWELVE], testing[THIRTEEN], 
                testing[FOURTEEN]);
        
        Course fundamental = new Course("Fundamentals 1100");
        fundamental.addStudent(stella);
        fundamental.addStudent(hannah);
        fundamental.addStudent(paula);
        fundamental.addStudent(catherine);
        fundamental.addStudent(jenny);
        System.out.println(fundamental.toString());
    }

};
