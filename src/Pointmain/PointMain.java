package Pointmain;
import java.util.*;
public class PointMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 points:");
        Point p1 = new Point(input.nextInt(),input.nextInt());
        System.out.println("Enter 2 more points:");
        Point p2 = new Point(input.nextInt(),input.nextInt());
        p1.translate(p2.x,p2.y);
        System.out.println("Here it is " +p1.toString());

    }
}
