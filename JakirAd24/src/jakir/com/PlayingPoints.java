
package jakir.com;

import java.awt.Point;

public class PlayingPoints {
    public static void main(String[] args) {
        Point ap=new Point();
        Point bp=new Point(50,25);
        Point cp=new Point(bp);
        System.out.println("ap is located  "+ap);
        ap.move(100, 50);
        
        bp.x=110;
        bp.y=70;
        ap.translate(10, 2);
        System.out.println("ap is now at: "+ap);
        if(ap.equals(bp)){
            System.out.println("ap and bp are at the same location.");
        }
    }
  
}
