//Dustin Luong 08/23/17
import java.util.Scanner;
public class TimeInterval{
    public static void main(String [] args){

        //prompts user for first time
        System.out.println("Enter the first time in military time:");
        Scanner in = new Scanner(System.in);
        int timeOne = in.nextInt();

        //prompts user for second time
        System.out.println("Enter the second time in military time:");
        Scanner in2 =  new Scanner(System.in);
        int timeTwo = in2.nextInt();

        //check if the values entered are valid
        if (timeOne > 2400 || timeTwo > 2400 || timeOne < 0 || timeTwo < 0 ||
            timeOne % 100 >= 60 || timeTwo % 100 >= 60) {
                System.out.println("Please enter valid times.");
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
    }

}
