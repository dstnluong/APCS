
/**
 * Write a description of class StudentTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentTester
{
    public static void main(String [] args)
    {
        Student s = new Student("Lucy");
        s.addQuiz(10, 10);
        s.addQuiz(15, 14);
        s.addQuiz(11, 10);
        
        System.out.println("Student: " + s.getName());
        System.out.println("Total points possible: " + s.getTotalScore());
        System.out.println("Average percentage scored: " + s.getAverageScore());
    }
}
