# Bug

Write a class Bug that models a bug moving along a horizontal line. The bug moves either to the right or left. Initially, the bug moves to the right, but it can turn to change its direction. In each move, its position changes by one unit in the current direction.Provide a constructor
 
public Bug(int initialPosition)
 
and methods
 
public void turn()
public void move()
public int getPosition()
 
 
 
Sample usage:
Bug brian - new Bug(10);
brian.move();   //now the position is 11
brian.turn();
brian.move(); //now the position is 10
brian.move(); //now the position is 9
