public class Bug {
    private int position;
    private int direction;
    public Bug(int initialPosition){
        position = initialPosition;
        direction = 1;
    }
    public void turn() {
        direction *= -1;
    }
    public void move() {
        position += direction;
    }
    public int getPosition(){
        return position;
    }
}
