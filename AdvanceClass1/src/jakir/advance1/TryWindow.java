
package jakir.advance1;

import javax.swing.JFrame;

public class TryWindow {
   static JFrame aWindow = new JFrame("This is the window title"); 
    public static void main(String[] args) {
      
//        int windowWidth = 400;
//        int windowHeight = 400;
//aWindow.setBounds(1, 0, 0, 0);
aWindow.setBounds(0, 0, 0, 0);
       // aWindow.setBounds(250, 100, 400, 250);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
    
}
