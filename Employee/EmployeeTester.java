
/**
 * Testing the Employee class
 * 
 * @author (Luc) 
 * @version (10/17/17)
 */
public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee brian = new Employee("Luong, Dustin", 60000);
        brian.raiseSalary(20);  //brian gets 20% salary raise
        brian.raiseSalary(10);
        
        System.out.println("Employee name: " + brian.getName());
        System.out.println("Salary: $" + brian.getSalary());
    }
    
}
