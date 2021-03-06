//Dustin Luong 10/02/17
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a value: ");
            int value = in.nextInt();
            double sqrt = sqrt(value);
            for(int i = 2; i <= sqrt; i++) {
                if(value % i == 0){
                    System.out.printf("%d %n", i);
                    value /= i;
                    i--;
                }
            }
            System.out.printf("%s%n", value == 1 ? "" : value);
            System.out.println("Enter '1' to rerun, or any other key and then enter to end.");
            if (in.hasNextInt() && in.nextInt() == 1) {
                System.out.printf("%n");
                continue;
            } else {
                break;
            }
        }
    }
}
