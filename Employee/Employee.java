//Dustin Luong 10/17/17

public class Employee {
    private String name;
    private double salary;
    public Employee(String employeeName, double currentSalary) {
        salary = currentSalary;
        name = employeeName;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;       
    }
    public void raiseSalary(double byPercent) {
        salary *= (1 + byPercent / 100);
    }
}
