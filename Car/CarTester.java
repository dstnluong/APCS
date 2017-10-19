
/**
 * Testing car class.
 * 
 * @author (luc) 
 * @version (a version number or a date)
 */
public class CarTester
{
    public static void main(String[] args)
    {
        Car c = new Car(25); //25 mpg
        c.addGas(10); //pumps 10 gal to tank
        c.drive(200); //goes 200 miles
        System.out.println("Gas remaining: " + c.getGasInTank());
        //prints out how much gas is left in tank.
        System.out.println("Miles before next fill up: " + c.getRemainingDistance());
        
        c.drive(100);
        System.out.println("Gas remaining: " + c.getGasInTank());
        //prints out how much gas is left in tank.
        System.out.println("Miles before next fill up: " + c.getRemainingDistance());
        
        c.addGas(8);
        c.drive(150);
        System.out.println("Gas remaining: " + c.getGasInTank());
        //prints out how much gas is left in tank.
        System.out.println("Miles before next fill up: " + c.getRemainingDistance());
    }
}
