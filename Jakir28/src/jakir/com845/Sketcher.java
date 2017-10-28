package jakir.com845;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Sketcher {

    public static void main(String[] args) {
        window = new SketchFrame("This is Window Titile");
        Toolkit theKit = window.getToolkit();
        Dimension wnDSize = theKit.getScreenSize();
        window.setBounds(wnDSize.width / 4, wnDSize.height / 4, wnDSize.width / 2, wnDSize.height / 2);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    private static SketchFrame window;
}