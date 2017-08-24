//Dustin Luong (08/22/17)
//Determine if a year is a leap year
import java.util.Scanner;
public class LeapYear {
  public static void main(String [] args) {
    System.out.println("This program tells you if a year is a leap year.");
    System.out.println("Enter a year:");
    Scanner in = new Scanner(System.in); //prompts user for a year
    int year = in.nextInt();
    String leapYear = year + " is a leap year.\n";
    String notLeapYear = year + " is not a leap year.\n";

    if (year < 0) {
      System.out.print("Please enter a valid year.\n");
    } else {
        if (year % 4 == 0) { //checks that it is mod 4
          if (year > 1582) { //bypasses mod 100 rule if year is less than 1582
            if (year % 100 == 0 && year % 400 != 0) { //mod 400 is an exception to the mod 100 rule
              System.out.print(notLeapYear);
            } else {
              System.out.print(leapYear);
            }
          } else {
            System.out.print(leapYear);
          }
        } else {
          System.out.print(notLeapYear);
        }
    }
  }
}
