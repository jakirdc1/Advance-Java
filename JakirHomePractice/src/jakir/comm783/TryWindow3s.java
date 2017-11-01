package jakir.comm783;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JFrame;

public class TryWindow3s {
 static JFrame aWindow = new JFrame("This is the Window Title");
    public static void main(String[] args) {
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        aWindow.setBounds(center.x-200, center.y-100, 500, 200);
        aWindow.getContentPane().setBackground(Color.MAGENTA);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }   
}
