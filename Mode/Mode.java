import java.util.*;
public class Mode {
    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.print("How many values do you wish to enter? "); //prompt for total amt of values
            int total = in.nextInt();
            int nums[] = new int[total];
	    int i = 0;
       	    int j = 0;
	    int counter = 0;
            System.out.println("Enter the values one by one:"); //insert values into an array
            for (i = 0; i < total; i++) {
                nums[i] = in.nextInt();
            }
	    System.out.print("Your data set: "); //Printing array 
            for(i = 0; i < nums.length; i++) {
            	System.out.print(nums[i] + " ");
            }
            int maxCount = 0;
	    for(i = 0; i < total; i++) {  //determining what is the highest number of repeats
		counter = 0;
	        for(j = i; i < total; i++) {
		     if(nums[i] == nums[j]) counter++;
	        }
	        if(counter > maxCount) maxCount = counter;
	    }
	    System.out.println(" ");
	    System.out.print("Mode: ");
            for (i = 0; i < nums.length; ++i) { //determining which values achieve that number of repeats
		counter = 0;
                for (j = i; j < nums.length; ++j) {
                    if (nums[j] == nums[i]) counter++;
                }
                if (counter == maxCount) System.out.print(nums[i] + " "); 
	    } 
	    System.out.println("");
            System.out.println("Enter '1' to rerun, or any other key and then enter to end.");//rerun
            if (in.hasNextInt() && in.nextInt() == 1) {
                continue;
            } else {
                break;
            }
        }
    }
}
