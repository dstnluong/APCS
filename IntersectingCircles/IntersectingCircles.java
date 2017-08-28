//Dustin Luong 08/26/17
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class IntersectingCircles {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            //prompt variables
                System.out.println("x-coordinate of the center of circle 1: ");
            double x1 = in.nextDouble();
                System.out.println("y-coordinate of the center of circle 1: ");
            double y1 = in.nextDouble();
                System.out.println("Radius of circle 1: ");
            double radius1 = in.nextDouble();
                System.out.println("x-coordinate of the center of circle 2: ");
            double x2 = in.nextDouble();
                System.out.println("y-coordinate of the center of circle 2: ");
            double y2 = in.nextDouble();
                System.out.println("radius of circle 2: ");
            double radius2 = in.nextDouble();
            double radiiDist = sqrt(Math.pow((x1 - x2), 2.0) + Math.pow((y1 - y2), 2.0));

            //edge cases
            if (x1 == x2 && y1 == y2 && radius1 == radius2 && radius1 == 0.0) {
                System.out.println("The circles intersect at one point.");
            } else if (x1 == x2 && y1 == y2 && radius1 == radius2 && radius1 != 0.0) {
                System.out.println("The circles intersect at infinitely many points.");
            //triangle inequality theorem
            } else if (radius1 < radius2 + radiiDist && radius2 < radius1 + radiiDist && radiiDist < radius1 + radius2) {
                System.out.println("The circles intersect at two points.");
            } else if (radius1 == radius2 + radiiDist || radius2 == radius1 + radiiDist || radiiDist == radius1 + radius2) {
                System.out.println("The circles intersect at one point.");
            } else {
                System.out.println("The circles do not intersect.");
            }
            //to rerun
            System.out.println("Enter '1' to rerun, or any other key and then enter to end.");
            if (in.hasNextInt() && in.nextInt() == 1) {
                continue;
            } else {
                break;
            }
        }
    }
}
