public class Student {
    private String name;
    private double earned;
    private double possible;
    public Student(String studentName){ 
        name = studentName;
        earned = 0;
        possible = 0;
    }
    public void addQuiz(int pointsEarned, int pointsPossible){
        earned += pointsEarned;
        possible += pointsPossible;
    }
    public String getName() {
        return name;
    }
    public double getTotalScore() {
        return possible;
    }
    public String getAverageScore(){
        return earned * 100 / possible + "%";
    }
}
