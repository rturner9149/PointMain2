package Pointmain;

public class Point {

    int x;
    int y;

    //point constructor
    public Point (int initialX, int initialY) {
        x=initialX;
        y=initialY;
    }

    //translate points
    public void translate(int dx, int dy) {
        x+=dx;
        y+=dy;
    }

    public String toString() {
        return "("+x+", "+y+")";
    }

}
