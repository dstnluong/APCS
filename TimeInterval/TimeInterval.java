//Dustin Luong 08/23/17
import java.util.Scanner;
public class TimeInterval{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        while(true) {

            //prompts user for first time
            System.out.print("Enter the first time in military time:");
            int timeOne = in.nextInt();

            //prompts user for second time
            System.out.print("Enter the second time in military time:");
            int timeTwo = in.nextInt();

            //check if the values entered are valid
            if (timeOne > 2400 || timeTwo > 2400 || timeOne < 0 || timeTwo < 0 ||
            timeOne % 100 >= 60 || timeTwo % 100 >= 60) {
                System.out.println("Please enter valid times.");
                //edge case
            } else if (timeOne % 2400 == timeTwo % 2400) {
                System.out.println("24 hours and 0 minutes");
            } else {

                //convert time into minutes
                int minutesOne = timeOne % 100;
                int minutesTwo = timeTwo % 100;
                int hourOne = timeOne / 100;
                int hourTwo = timeTwo / 100;
                int totalminutesOne = 60 * hourOne + minutesOne;
                int totalminutesTwo = 60 * hourTwo + minutesTwo;

                //find difference between the two times and reconvert into hours and minutes
                int timeDiff = (totalminutesTwo - totalminutesOne + 1440) % 1440;
                int timeDiffminutes = timeDiff % 60;
                int timeDiffhours = timeDiff / 60;

                //print the result
                System.out.println(timeDiffhours + " " +
                    (timeDiffhours == 1 ? "hour" : "hours")
                    + " and " + timeDiffminutes + " " +
                    (timeDiffminutes == 1 ? "minute" : "minutes"));
            }
            System.out.println("Enter '1' to rerun, or any other key and then enter to end.");
            if (in.hasNextInt() && in.nextInt() == 1) {
                continue;
            } else {
                break;
            }
        }
    }
}
