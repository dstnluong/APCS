public class BugTester {
    public static void main(String[] args){
        Bug andrew = new Bug(3);
        andrew.move();
        andrew.move();
        System.out.println("Position: " + andrew.getPosition()); //5
        andrew.turn();
        andrew.move(); 
        System.out.println("Position: " + andrew.getPosition()); // 4
    }
}
