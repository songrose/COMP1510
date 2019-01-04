/**
 * 
 */
package q4;


/**
 * <p> Makes course class with a list of students. 
 * this course object can be used to represent a
 * real life course. </p>
 * @author Rose Song
 * @version 1. 
 */
public class Course {
    /** Makes course member.**/
    private static int courseMember;
    /** constant five. **/
    private static final int FIVE = 5;
    /** Makes course name.**/
    private String courseName;

    /** Makes student array..**/

    private  Student[] test = new Student[FIVE];
    /**
     * Constructor.
     * @param name
     * This is the course constructor. 
     */
    
    public Course(String name) {
        courseName = name;
        courseMember = 0;
    }
    /**
     *  gets the course name.
     * @return
     *  course name.
     */
    public String getCourseName() {
        return courseName;
    }
    /**
     * Adds student as an object.
     * @param one
     * Student object one.
     */
    public void addStudent(Student one) {
        test[courseMember] = one;
        courseMember++;

        
    }
    /**
     *  Gets the course member.
     * @return
     * course member.
     */
    public static int getCourseMember() {
        return courseMember;
    }
    /**
     * gets the average of a number.
     * @return
     * the average of the test number.
     */
    public double getAverage() {
        double one = 0.0;

        for (int i = 0; i < FIVE; i++) {
            one = one + test[i].average();
        }
        one = one / FIVE;
        return one;
    }
/**
 * public string.
 * @return string of whole.
 */
    public String toString() {
        String full = "";
        full = "Course name: " + this.getCourseName();
        for (int i = 0; i < FIVE; i++) {
            full +=  "\nStudent #" + (i + 1) 
            + " ," + "Information: " + test[i].toString();
        }
        full += "\n The whole average of tests from five students: "
                + this.getAverage();
        return full;
    }
}
