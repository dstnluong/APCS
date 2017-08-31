import java.util.Scanner;
public class Lines {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        while(true){
            double m1 = 0;
            double m2 = 0;
            double yInt1 = 0;
            double yInt2 = 0;
            double vert1 = 0;
            double vert2 = 0;
            double o = 1;
            double p = 1;
            double infinity = 1 / (o - p);
            // Line one
            System.out.println("Enter line 1:");
            System.out.println("1) point-slope");
            System.out.println("2) point-point");
            System.out.println("3) slope-intercept");
            System.out.println("4) vertical line");
            int line1 = in.nextInt();
            if(line1 == 1) {
                 System.out.print("slope=");
                 m1 = in.nextDouble();
                 System.out.print("x-coordinate=");
                 double x = in.nextDouble();
                 System.out.print("y-coordinate=");
                 double y = in.nextDouble();
                 yInt1 = y - m1 * x;
            } else if (line1 == 2){
                System.out.print("x-coordinate of point 1=");
                double x1 = in.nextDouble();
                System.out.print("y-coordinate of point 1=");
                double y1 = in.nextDouble();
                System.out.print("x-coordinate of point 2=");
                double x2 = in.nextDouble();
                System.out.print("y-coordinate of point 2=");
                double y2 = in.nextDouble();
                if (x1 == x2 && y1 == y2) {
                    System.out.println("Enter two distinct points.");
                    break;
                } else {
                    m1 = (y1 - y2) / (x1 - x2);
                    yInt1 = y1 - m1 * x1;
                }
            } else if (line1 == 3) {
                System.out.print("slope=");
                m1 = in.nextDouble();
                System.out.print("y-intercept=");
                yInt1 = in.nextDouble();
            } else if (line1 == 4) {
                System.out.print("x=");
                vert1 = in.nextDouble();
            }
            // Line 2
            System.out.println("Enter line 2:");
            System.out.println("1) point-slope");
            System.out.println("2) point-point");
            System.out.println("3) slope-intercept");
            System.out.println("4) vertical line");
            int line2 = in.nextInt();
            if(line2 == 1) {
                 System.out.print("slope=");
                 m2 = in.nextDouble();
                 System.out.print("x-coordinate=");
                 double x = in.nextDouble();
                 System.out.print("y-coordinate=");
                 double y = in.nextDouble();
                 yInt2 = y - m2 * x;
            } else if (line2 == 2) {
                System.out.print("x-coordinate of point 1=");
                double x1 = in.nextDouble();
                System.out.print("y-coordinate of point 1=");
                double y1 = in.nextDouble();
                System.out.print("x-coordinate of point 2=");
                double x2 = in.nextDouble();
                System.out.print("y-coordinate of point 2=");
                double y2 = in.nextDouble();
                if (x1 == x2 && y1 == y2) {
                    System.out.println("Enter two distinct points.");
                    break;
                } else {
                    m1 = (y1 - y2) / (x1 - x2);
                    yInt1 = y1 - m1 * x1;
                }
                m2 = (y1 - y2) / (x1 - x2);
                yInt2 = y1 - m2 * x1;
            } else if (line2 == 3) {
                System.out.print("slope=");
                m2 = in.nextDouble();
                System.out.print("y-intercept=");
                yInt2 = in.nextDouble();
            } else if (line2 == 4) {
                System.out.print("x=");
                vert2 = in.nextDouble();
            }
            //
            if (m1 == Math.abs(infinity) || m2 == Math.abs(infinity)) {
                System.out.println("Please use input method 4 to input vertical lines.");
                break;
            } else if(line1 == 4 && line2 == 4) { //vertical lines cases
                if (vert1 == vert2) {
                    System.out.println("The lines coincide.");
                } else {
                    System.out.println("The lines are parallel.");
                }
            } else if (line1 == 4 || line2 == 4) {
                System.out.println("The lines intersect.");
            } else if (m1 == m2) { // other three cases
                if (yInt1 == yInt2) { //slopes are equal and same y-intercept
                    System.out.println("The lines coincide.");
                } else { //slopes are equal but not the same y-intercept
                    System.out.println("The lines are parallel.");
                }
            } else { //different slope and different y-intercept
                System.out.println("The lines intersect.");
            }
            System.out.println(m1);
            System.out.println(m2);
            System.out.println(yInt1);
            System.out.println(yInt2);
            System.out.println("Enter '1' to rerun, or any other key and then enter to end.");
             if (in.hasNextInt() && in.nextInt() == 1) {
              continue;
            } else {
              break;
            }
        }
    }
}
