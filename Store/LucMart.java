
/**
 * Testing Store class.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class LucMart
{
    public static void main(String[] args)
    {
        Store lucy = new Store();
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        
        while (cont)
        {
            System.out.println("Welcome to LucMart, where Luc is always right.");
            System.out.println("Enter [1] to add an item. ");
            System.out.println("Enter [2] to sell an item. ");
            System.out.println("Enter [3] to adjust item price. ");
            System.out.println("Enter [4] to print inventory. ");
            System.out.println("Enter anything else to quit.");
            int input = in.nextInt();
            System.out.print("Enter item name. ");
            String name = in.next();
            
            if (input == 1)
            {
                System.out.print("Enter item's price and SKU. ");
                double price = in.nextDouble();
                String sku = in.next();
                Item i = new Item(name, price, sku);
                lucy.addItem(i);
              
            }
            else if (input == 2)
            {
                System.out.print("How many items? ");
                int count= in.nextInt();
                lucy.sell(name, count);
            }
            else if (input == 3)
            {
                System.out.print("What is the adjusted price? ");
                double price = in.nextDouble();
                lucy.setDiscountPrice(name, price);
            }
            else if (input == 4)
                lucy.printInventory();
            else
                cont = false;
        }
    }
                
            
            
}
