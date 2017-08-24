//Dustin Luong 08/22/17
// Enter a GPA value and return it's grade letter equivalent
import java.util.Scanner;
public class Grade {
    public static void main(String [] args) {
        System.out.println("Enter your GPA:");
        Scanner in = new Scanner(System.in);
        double GPA = in.nextDouble();
        String youHave = "You have";
        if (GPA > 4.0 || GPA < 0) {
            System.out.println("Please enter a valid GPA");
        } else {
            if (GPA == 4) {
                System.out.println(YouHave + " an A.");
            } else if (GPA >= 3.7) {
                System.out.println(YouHave + " an A-.");
            } else if (GPA >= 3.3) {
                System.out.println(YouHave + " a B+.");
            } else if (GPA >= 3.0) {
                System.out.println(YouHave + " a B.");
            } else if (GPA >= 2.7) {
                System.out.println(YouHave + " a B-.");
            } else if (GPA >= 2.3) {
                System.out.println(YouHave + " a C+.");
            } else if (GPA >= 2.0) {
                System.out.println(YouHave + " a C.");
            } else if (GPA >= 1.7) {
                System.out.println(YouHave + " a C-.");
            } else if (GPA >= 1.3) {
                System.out.println(YouHave + " a D+.");
            } else if (GPA >=1.0) {
                System.out.println(YouHave + " a D.");
            } else {
                System.out.println(YouHave + " an E/F.");
            }
        }
    }
}
