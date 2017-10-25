
package jakir.com;

import java.awt.Point;

public class PlayingPointsAlter {
    public static void main(String[] args) {
        Point p1=new Point();
        Point p2=new Point(20, 400);
        System.out.println(p1);
        p1.move(100, 200);
        System.out.println(p1);
        p1.setLocation(210, 410);
        System.out.println(p1.getLocation());
        System.out.println(p1);
        p1.translate(10, 20);
        System.out.println(p1.getLocation());
        System.out.println(p1);
        System.out.println(p1.equals(p2));
    }
  
}
