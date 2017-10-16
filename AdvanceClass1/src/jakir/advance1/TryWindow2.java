
package jakir.advance1;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TryWindow2 {
    static JFrame aWindow = new JFrame("This is the window title");
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();//Get the window toolkit
        Dimension widSize = theKit.getScreenSize();//Get screen size
        aWindow.setBounds(widSize.width/4, widSize.height/4, widSize.width/2, widSize.height/2);
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aWindow.setVisible(true);
    }
}
