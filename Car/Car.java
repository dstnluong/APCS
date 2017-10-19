public class Car {
    private double efficiency;
    private double gas;
    private int capacity;
    public Car(double carEfficiency){
        efficiency = carEfficiency;
        gas = 0;
        capacity = 15;
    }
    public double drive(double distance){
        gas -= distance / efficiency; 
        if(gas < 0) {
            gas = 0;
        }
        return gas;
    }
    public double getGasInTank(){
        return gas;
    }
    public double addGas(double moreGas){
        gas += moreGas; 
        if(gas > 15) {
            gas = 15;
        }
        return gas;
    }
    public double getRemainingDistance(){
        return gas * efficiency;
    }
}
