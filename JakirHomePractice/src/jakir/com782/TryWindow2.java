package jakir.com782;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TryWindow2 {
   static JFrame aWindow = new JFrame("This is the Window Title");                                                                                    
    public static void main(String[] args) {
        Toolkit kit = aWindow.getToolkit();
        Dimension size = kit.getScreenSize();
    aWindow.setBounds(size.width/4, size.height/4, size.width/2, size.height/2);       
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aWindow.setVisible(true); 
    }
}
