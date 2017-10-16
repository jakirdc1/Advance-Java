
package jakir.advance1;

import java.awt.Point;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
public class TryWindow3 {
 static JFrame aWindow = new JFrame("This is the window title");
   
 public static void main(String[] args) {
 Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
     int windowWidth = 400;  
     int windowHieght = 150;  
     
   aWindow.setBounds(center.x-windowWidth/2, center.y-windowHieght/2, center.x-windowWidth, center.y-windowHieght);
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aWindow.setVisible(true);
    }
}


