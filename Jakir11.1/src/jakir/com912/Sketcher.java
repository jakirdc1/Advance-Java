
package jakir.com912;

import java.awt.Dimension;
import java.awt.Toolkit;

  public class Sketcher {

    private static ToolBarWithIcon window;

    public static void main(String[] args) {
        window = new ToolBarWithIcon("ToolBar with icon");
        Toolkit theKit = window.getToolkit();
        Dimension winSize = theKit.getScreenSize();

        window.setBounds(winSize.width / 4, winSize.height / 4, winSize.width / 2, winSize.height / 2);
        window.setVisible(true);
    }
}  

