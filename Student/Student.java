public class Student {
    private String name;
    private double percentage;
    private int taken;
    private int possible;
    public Student(String studentName){ 
        name = studentName;
        taken = 0;
        possible = 0;
    }
    public void addQuiz(int pointsEarned, int pointsPossible){
        double earned = pointsEarned;
        double possible = pointsPossible;
        percentage += (earned / possible);
        possible += pointsPossible;
        taken ++;
    }
    public String getName() {
        return name;
    }
    public int getTotalScore() {
        return possible;
    }
    public String getAverageScore(){
        double averagePercentage = 100 * percentage / taken;
        return averagePercentage + "%";
    }
}
