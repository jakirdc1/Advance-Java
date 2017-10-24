
package jakir.visual;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TryFlowLayyout {
    static JFrame aWindow = new JFrame("This is a Flow Layout");
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize= theKit.getScreenSize();
        aWindow.setBounds(0, 0, 0, 0);
    }
}
