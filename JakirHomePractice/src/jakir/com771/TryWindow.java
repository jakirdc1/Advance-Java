
package jakir.com771;

import javax.swing.JFrame;

public class TryWindow {
  static JFrame aWindow = new JFrame("This is the Window Title");
    public static void main(String[] args) {
//        int windowWidth=400;
//         int windowHight=300;
    aWindow.setBounds(250, 300, 500, 300);
     aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     aWindow.setVisible(true);
        
    }
        
}
