package q4;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Student {
    /** final int of 3. **/
    private static final int THREE = 3;
    /** final int of 3 in double.**/
    private static final double THREED = 3.0;
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    /** new array list test.**/
    private  int[] test = new int[THREE];
    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     */
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        for (int i = 0; i < THREE; i++) {
            test[i] = 0;
        }
    }
    /**
     * Sets all the test scores.
     * @param score0
     * score 0 of first test.
     * @param score1
     * score 1 of first test.
     * @param score2
     * score 3 of first test.
     */
    public void setAllTestScore(int score0, int score1, int score2) {
        test[0] = score0;
        test[1] = score1;
        test[2] = score2;

    }
    /**
     * Sets test score of a certain test.
     * @param testNumber
     * Test number of test.
     * @param score
     * Score of that test.
     */
    public void setTestScore(int testNumber, int score) {
        test[testNumber - 1] = score;
    }
    /**
     * accessor of test score.
     * @param testNumber
     * test number of the test you want to access.
     * @return
     * test score.
     */
    public int getTestScore(int testNumber) {
        int sco = test[testNumber - 1];
        return sco;
    }
    /**
     *  calculates the average of all the tests.
     * @return average
     */
    public double average() {
       double av = (double) (test[0] + test[1] + test[2]) / THREED;
       return av;
        
    }
    /**
     * Returns a String description of this Student object.
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test Score #1:" + this.getTestScore(1) + "\n";
        result += "Test Score #2:" + this.getTestScore(2) + "\n";
        result += "Test Score #3:" + this.getTestScore(THREE) + "\n";
        result += "Average Test Score: " + this.average() + "\n";

        return result;
    }
}