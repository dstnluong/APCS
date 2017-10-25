public class WeeklyWage {
    private double wage;
    private int[] hours;
    public WeeklyWage(int[] hoursWorked, double hourlyPay) {
        hours = hoursWorked;
        wage = hourlyPay;        
    }
    public int getTotalHours(){
        int total = 0;
        for(int i = 0; i < 7; i++){
            total += hours[i];
        }
        return total;
    }
    public int getTotalOvertimeHours(){
        int total = 0;
        for(int i = 1; i < 6;i++) {
            if(hours[i] > 8) {
                total += hours[i] - 8; 
            } 
        }
        total += hours[0] + hours[6];
        return total;
    }
    public void raise(int raiseAmount){
        wage += raiseAmount; 
    }
    public double getWeeklyPay() {
        double pay = 0;
        pay += 2.00 * wage * hours[0];
        for(int i = 1; i < 6; i++) {
            if(hours[i] > 8){
                pay += (hours[i] - 8) * 1.50 * wage + 8 * wage; 
            } else {
                pay += hours[i] * wage; 
            }
        }
        pay += 1.50 * wage * hours[6];
        return pay;
    }
}
