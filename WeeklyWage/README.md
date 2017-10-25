# WeeklyWage

Write a program, WeeklyWage, that calculates an employee weekly wage. The constructor takes in an array that represents the number hours worked each day for the week (first number being Sunday's hours and last number being Saturday's hours). Constructor also has a second parameter representing the hourly wage for this particular employee.

WeeklyWage will have the following methods: getTotalHours to return total number of hours worked this week, getTotalOvertimeHours to return the total overtime (over 8 hours) hours worked, getWeeklyPay returns employee's weekly earning (included overtime), and raise(int raiseAmount) which updates employee's hourly wage by the raiseAmount.

Overtime pay is determined as 1.5x pay for any hours over 8 hours on a weekday. 1.5x pay for hours worked on Saturday. And 2x pay for hours worked on Sunday.


Sample Run:

int[] hours = new int[7];
hours = {2, 9, 8, 10, 8, 8, 4};
double wage = 20;
Employee lucy = new Employee(hours, wage);
lucy.raise(5);  //lucy makes $25 an hour now
