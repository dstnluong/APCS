public class WeeklyWageTester {
    public static void main(String[] args){
        int[] hours = new int[] {2, 9, 8, 10, 8, 8, 4};
        double wage = 20;
        WeeklyWage andrew = new WeeklyWage(hours, wage);
        andrew.raise(5);
        System.out.println("Total Hours: " + andrew.getTotalHours());
        System.out.println("Total Overtime Hours: " + andrew.getTotalOvertimeHours());
        System.out.println("Weekly Pay: $" + andrew.getWeeklyPay());
    }
}
