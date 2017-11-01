package jakir.com783;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TryWindow3 {
    static JFrame aWindow = new JFrame("This is the Window Title");                                                                                    
    public static void main(String[] args) {
        Point center =GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int windowWidth=400;
        int windowHight=150;
//        Toolkit kit = aWindow.getToolkit();
//        Dimension size = kit.getScreenSize();
    aWindow.setBounds(center.x-windowWidth/2,center.y-windowHight/2, windowWidth, windowHight);       
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aWindow.setVisible(true); 
    }
}
